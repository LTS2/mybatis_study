package com.wj.mybatis_boot.controller;

import com.wj.mybatis_boot.model.dto.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MemberController {


	// bean 이 다중 id 로 여러 개 선언된 경우
	// 1. UnsatisfiedDependencyException
	// 2. NoUnsatisfiedDependencyException
	// 들의 예외가 발생한다. 그럴 경우 직접 명시해주는 @Autowired + @Qualifier() 를 사용하면 원하는 id 값을 가지고 올 수 있다.
	@Autowired
	@Qualifier("testMember")
	Member member;

	@Autowired
	Member member2;


	@GetMapping("/member/index.do")
	public String index(){
		log.info("MemberController.index() executed");

		return "member/index";
	}

	// 회원가입 메서드
	@RequestMapping("/member/memberEnroll.do")
	public String memberEnroll(Model model, Member member){
		log.info("MemberController.memberEnroll() executed");
		log.info("가입 정보 {}", member);
//		int result =


		return "member/memberEnroll";
	}

	@RequestMapping("/member/error.do")
	public String error(String msg){
		log.info("MemberController.error() executed {}", msg);

		return "common/error";
	}
}
