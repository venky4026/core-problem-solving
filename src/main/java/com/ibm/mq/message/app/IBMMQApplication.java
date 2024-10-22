package com.ibm.mq.message.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class IBMMQApplication {

	public static void main(String[] args) {
		int num=Integer.parseInt("123");
		System.out.println(num);
		SpringApplication.run(IBMMQApplication.class, args);
	}

}
