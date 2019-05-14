package co.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	private UserDao dao;

	@RequestMapping("/")
	public ModelAndView home() {

		return new ModelAndView("index");
	}

	@RequestMapping("/users")
	public ModelAndView userTable() {

		ModelAndView mav = new ModelAndView("users");
		mav.addObject("list", dao.findAll());
		return mav;
	}

	@RequestMapping("/landing")
	public ModelAndView landing(@RequestParam("username") String username) {

		ModelAndView mav = new ModelAndView("landing");
		mav.addObject("name", username);

		return mav;
	}

	@RequestMapping("/create")
	public ModelAndView newUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("username") String username, @RequestParam("password") String password) {

		ModelAndView mav = new ModelAndView("redirect:/");
		User user = new User(username, password, firstName, lastName);
		dao.create(user);

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
