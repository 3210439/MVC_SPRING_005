package com.spring.mvc.BoardController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/get", method=RequestMethod.GET, params="register")
	public String registerForm() { 
		logger.info("getregisterform");
		return "/board/register";
	}
	
	@RequestMapping(value = "/post", method=RequestMethod.POST, params="register")
	public String register() {
		logger.info("post");
		return "/board/list";
	}

	@RequestMapping(value = "/get", method=RequestMethod.GET, params="modify")
	public String modifyForm() {
		logger.info("getmodify");
		return "/board/modify";
	}
	
	@RequestMapping(value = "/post", method=RequestMethod.POST, params="modify")
	public String modify() {
		logger.info("postmodify");
		return "/board/list";
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET, params="remove")
	public String removeForm() {
		return "/board/remove";
	}

	@RequestMapping(value="/post", method=RequestMethod.POST, params="remove")
	public String remove() {
		return "/board/list";
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET, params="list")
	public String list() {
		return "/board/list";
	}
	
	@RequestMapping(value = "/get", method=RequestMethod.GET, params="read")
	public String read(@RequestParam(value = "boardno") int boardno)
	{
		//logger.info("boardno: "+boardno);
		return "board/read";
	}

	@RequestMapping("/read2/{no}")
	public String read2(@PathVariable("no") int boardno)
	{
		logger.info("boardno: "+boardno);
		return "board/read";
	}
}
