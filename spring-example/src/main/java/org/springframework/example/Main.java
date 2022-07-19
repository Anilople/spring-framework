package org.springframework.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		context.register(MyBean.class);
		context.refresh();
		System.out.println(context.getBean(MyBean.class));
	}

	static class MyBean {

	}
}
