package com.iqmsoft.springmvc.react.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iqmsoft.springmvc.react.web.entity.User;
import com.iqmsoft.springmvc.react.web.service.UserService;
import com.iqmsoft.springmvc.react.web.service.impl.UserServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Controller
public class WelcomeController {

//	private static final Logger logger =
//			LoggerFactory.getLogger(WelcomeController.class);

	

	@RequestMapping(value = { "/*", "/*/*" }, method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("go to welcome contoller");
		return "index";
	}

}
