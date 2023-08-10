package com.wj.mybatis_boot.controller;

import com.wj.mybatis_boot.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class HomeController {

	@Autowired
	Member member;

	@GetMapping("/")
	public String home(Locale locale, Model model) {

		return "";
	}
}
