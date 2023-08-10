package com.wj.mybatis_boot.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Member {
	private String 	 id;
	private String 	 password;
	private String 	 name;
	private int 	 age;
	private String 	 gender;
	private String 	 phone;
	private String 	 address;
	private String 	 email;
	private String[] hobby; // 축구,야구,영화보기
	private Date enrollDate;

}
