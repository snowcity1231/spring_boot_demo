package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @ClassName: MainController 
* @Description: TODO
* @author xuechen
* @date 2017年1月3日 上午10:28:00 
*  
*/
@Controller
public class MainController {
	
	/**
	 * 映射到index.html
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
	    return "index";
	}
	
	/**
	 * 映射到hello.html
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
