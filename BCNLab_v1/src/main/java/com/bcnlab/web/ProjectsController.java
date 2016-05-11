package com.bcnlab.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectsController {
	private static final Logger logger = LoggerFactory.getLogger(ProjectsController.class);

	@RequestMapping(value = "/projects")
	public String projects(Model model) {
		logger.info("Projects Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "projects";
	}
}
