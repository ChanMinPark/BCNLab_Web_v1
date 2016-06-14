package com.bcnlab.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@RequestMapping(value = "/member/professor")
	public String professor(Model model) {
		logger.info("Professor Introduction Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "member_professor";
	}
	
	@RequestMapping(value = "/member/researcher")
	public String researcher(Model model) {
		logger.info("Researcher Introduction Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "member_researcher";
	}
	
	@RequestMapping(value = "/member/alumni")
	public String alumni(Model model) {
		logger.info("Alumni Introduction Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "member_alumni";
	}
}
