package io.datajek.spring.basics.movierecommendersystem.lesson7;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
				
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
		
		//RecommenderImplementation2 injects dependency using setter method
	    System.out.println("Calling getBean() on RecommenderImplementation2");
	    RecommenderImplementation2 recommender2 = appContext.getBean(
	                                                 RecommenderImplementation2.class); 

	    result = recommender2.recommendMovies("Finding Dory");
	    System.out.println(Arrays.toString(result));
	}

}
