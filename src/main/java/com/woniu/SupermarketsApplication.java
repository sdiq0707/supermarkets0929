package com.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.woniu.dao")
public class SupermarketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketsApplication.class, args);
	}

}
