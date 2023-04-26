package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("hello world");

		long l = System.currentTimeMillis();
		System.out.println(l);
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());

		long millis = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(millis);
		System.out.println(timestamp);

		long a1 = 1682441171100L;
		long a2 = 1682441171100L;
		long a3 = 1682441171101L;
		long a4 = 1682441171150L;
		long a5 = 1682441171200L;
		long a6 = 1682441171155L;
		long a7 = 1682441171210L;
		long a8 = 1682441171200L;
		long a9 = 1682441171220L;
		long a10 = 1682441171260L;
		long a11 = 1682441171300L;
		long a12 = 1682441171310L;
		long a13 = 1682441171250L;
		long a14 = 1682441171400L;
		long a15 = 1682441171500L;
		long a16 = 1682441171505L;
		long a17 = 1682441171510L;
		long a18 = 1682441171700L;
		long a19 = 1682441171710L;
		long a20 = 1682441171715L;

	}

}
