package com.tutorials.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@AllArgsConstructor 
@ToString
@Setter
@Getter 
public class User {

	private String userId;
	private int passWord;
	private String userName;	

}
