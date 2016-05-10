package com.bcnlab.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfessorIntroController {
	private static final Logger logger = LoggerFactory.getLogger(ProfessorIntroController.class);

	@RequestMapping(value = "/professor")
	public String professor(Model model) {
		logger.info("Professor Introduction Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "professorIntro";
	}
}
