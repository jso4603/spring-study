package com.java.spring_01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/content")
public class ContentController {

	@RequestMapping("/model")
	public String modelEx(Model model) {
		model.addAttribute("data","modeldata");

		return "/content/model";
	}

	@RequestMapping("/modelAndView")
	public ModelAndView modelAndView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "jso4603");
		mv.setViewName("/content/modelAndView");

		return mv;
	}
}
