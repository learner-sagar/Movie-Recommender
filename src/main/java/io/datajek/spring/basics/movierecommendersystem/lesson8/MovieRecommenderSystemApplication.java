package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		
		ContentBasedFilter cbf1 = context.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = context.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3 = context.getBean(ContentBasedFilter.class);
		
		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);
		
		CollaborativeFilter cf1 = context.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf2 = context.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf3 = context.getBean(CollaborativeFilter.class);
		
		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);
		
	}

}
