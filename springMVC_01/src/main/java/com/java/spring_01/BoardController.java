package com.java.spring_01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.spring_01.member.Member;

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

//	HttpServletRequest를 이용하여 Parameter 값 얻기
	@RequestMapping("/confirmId")
	public String confirmId(HttpServletRequest httpServletRequest ,Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");

		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		return "/board/confirmId";
	}

//	@RequestParm를 이용하여 Parameter 값 얻기
//	Parameter 값이 없으면 400 에러 호출
	@RequestMapping("/checkId")
	public String checkId(@RequestParam("id") String id,@RequestParam("pw") String pw, Model model) {

		model.addAttribute("id",id);
		model.addAttribute("pw",pw);

		return "/board/checkId";
	}

//	데이터(커맨드) 객체 이용
//	@RequestMapping("/memberInfo")
//	public String memberInfo(@RequestParam("name") String name, @RequestParam("id") String id,
//			@RequestParam("pw") String pw, @RequestParam("email") String email, Model model) {
//
//		Member member = new Member();
//		member.setName(name);
//		member.setId(id);
//		member.setPw(pw);
//		member.setEmail(email);
//
//		model.addAttribute("member",member);
//
//		return "/board/memberInfo";
//	}
	@RequestMapping("/memberInfo")
	public String memberInfo(Member member) {

		return "/board/memberInfo";
	}

}
