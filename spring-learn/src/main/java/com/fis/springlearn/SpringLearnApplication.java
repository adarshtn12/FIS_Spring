package com.fis.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
	}

	static void displayDate() {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		try {
			SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
			Date parseDate = format.parse("31/12/2020");
			System.out.println(parseDate);

			SimpleDateFormat format1 = context.getBean("dateFormat", SimpleDateFormat.class);
			Date parseDate1 = format1.parse("08/09/2021");
			System.out.println(parseDate1);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
