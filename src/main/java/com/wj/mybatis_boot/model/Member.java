package com.wj.mybatis_boot.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Member {
	private String id;
	private String name;
	private int age;
	private String test;
	private String description;

}
