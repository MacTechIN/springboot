package com.tutorials;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tutorials.domain.User;

@SpringBootTest
public class UserTest {
	@Test
	public void testGetterSetter() {
		User sam = new User("1", 1, "Sam");
		User woong = new User("2", 2, "Woong");	
		
		sam.setUserId("2");
		sam.setPassWord(1233);
		sam.setUserName("Test Name ");
	
		System.out.println(woong.getUserId());
		System.out.println(woong.getPassWord());
		System.out.println(woong.getUserName());
		
		
		System.out.println(sam);
		System.out.println(woong);

	}

}
