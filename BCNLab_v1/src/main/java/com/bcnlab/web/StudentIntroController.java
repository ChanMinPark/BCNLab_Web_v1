package com.bcnlab.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class StudentIntroController {
	private static final Logger logger = LoggerFactory.getLogger(StudentIntroController.class);

	@RequestMapping(value = "/student")
	public String student(Model model) {
		logger.info("Professor Introduction Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "studentIntro";
	}
}
