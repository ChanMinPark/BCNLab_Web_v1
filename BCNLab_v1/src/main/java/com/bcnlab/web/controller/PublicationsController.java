package com.bcnlab.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicationsController {
	private static final Logger logger = LoggerFactory.getLogger(PublicationsController.class);

	@RequestMapping(value = "/publications/journal")
	public String journal(Model model) {
		logger.info("Publications - Journal Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "publications_journal";
	}
	
	@RequestMapping(value = "/publications/conference")
	public String conference(Model model) {
		logger.info("Publications - Conference Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "publications_conference";
	}
	
	@RequestMapping(value = "/publications/patents")
	public String patents(Model model) {
		logger.info("Publications - Patents Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "publications_patents";
	}
}
