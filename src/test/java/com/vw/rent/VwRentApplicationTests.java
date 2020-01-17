package com.vw.rent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VwRentApplicationTests {

	@Test
	public void contextLoads() {
	}

	public static void main(String[] args) {
		System.out.println((new Date().getTime()+"").length());
	}

}
