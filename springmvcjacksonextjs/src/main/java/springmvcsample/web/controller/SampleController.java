package springmvcsample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping(("/index"))
	public ModelAndView index() {
		System.out.println("Sample Controller");
		ModelAndView mav = new ModelAndView("view/sample/index");
		mav.addObject("personName", "Sample");
		return mav;
	}

}
