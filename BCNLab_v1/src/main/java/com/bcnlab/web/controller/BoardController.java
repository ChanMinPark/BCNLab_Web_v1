package com.bcnlab.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value = "/board/news", method = RequestMethod.GET)
	public String news(Locale locale, Model model) {
		logger.info("Board/news Page.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "board_news";
	}
	
	@RequestMapping(value = "/board/trend", method = RequestMethod.GET)
	public String trend(Locale locale, Model model) {
		logger.info("Board/trend Page.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "board_trend";
	}
	
	@RequestMapping(value = "/board/assignment ", method = RequestMethod.GET)
	public String assignment(Locale locale, Model model) {
		logger.info("Board/assignment  Page.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "board_assignment";
	}
	
}
