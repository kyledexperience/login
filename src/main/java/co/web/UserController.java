package co.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public ModelAndView landing(@RequestParam("name") String name) {

		ModelAndView mav = new ModelAndView("landing");
		mav.addObject("name", name);

		return mav;
	}

}
