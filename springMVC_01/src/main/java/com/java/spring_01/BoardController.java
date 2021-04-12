package com.java.spring_01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@RequestMapping("/view")
	public String view() {
		return "/board/view";
	}

	@RequestMapping("/content")
	public String content(Model model) {

		model.addAttribute("id","jso4603");

		return "/board/content";
	}
}
