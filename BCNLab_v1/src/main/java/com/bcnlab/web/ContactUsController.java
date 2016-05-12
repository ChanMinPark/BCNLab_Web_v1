package com.bcnlab.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {
	private static final Logger logger = LoggerFactory.getLogger(ContactUsController.class);

	@RequestMapping(value = "/contactus")
	public String contactus(Model model) {
		logger.info("Contact Us Page.");


		//model.addAttribute("serverTime", formattedDate );

		return "contactus";
	}
}
