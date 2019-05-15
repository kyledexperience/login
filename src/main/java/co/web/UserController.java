package co.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

	@Autowired
	private UserDao dao;

	@RequestMapping("/")
	public ModelAndView home() {

		return new ModelAndView("index");
	}

	@PostMapping("/")
	public ModelAndView submit(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, RedirectAttributes redir) {
		User user = dao.findByUsername(username);

		if (user == null || !password.equals(user.getPassword())) {
			ModelAndView mav = new ModelAndView("/");
			mav.addObject("message", "Incorrect username or password");
			return mav;
		}

		session.setAttribute("user", user);

		redir.addFlashAttribute("message", "Logged in.");
		return new ModelAndView("redirect:/landing");

	}

	@RequestMapping("/users")
	public ModelAndView userTable() {

		ModelAndView mav = new ModelAndView("users");
		mav.addObject("list", dao.findAll());
		return mav;
	}

	@RequestMapping("/landing")
	public ModelAndView landing(HttpSession session) {

		ModelAndView mav = new ModelAndView("landing");

		return mav;
	}

	@RequestMapping("/create")
	public ModelAndView newUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {

		ModelAndView mav = new ModelAndView("redirect:/");
		User user = new User(username, password, firstName, lastName);
		dao.create(user);

		session.setAttribute("user", user);

		return mav;

	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable(value = "id", required = false) Long id) {

		ModelAndView mav = new ModelAndView("edit");
		mav.addObject("user", dao.findById(id));

		return mav;

	}

	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("id") Long id) {

		ModelAndView mav = new ModelAndView("redirect:/users");
		User user = dao.findById(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUsername(username);
		user.setPassword(password);
		dao.update(user);

		return mav;
	}

	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable(value = "id", required = false) Long id) {

		ModelAndView mav = new ModelAndView("redirect:/users");
		dao.delete(id);
		return mav;

	}

}
