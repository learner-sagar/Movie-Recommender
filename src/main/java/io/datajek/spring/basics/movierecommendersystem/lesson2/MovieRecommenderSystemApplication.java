package io.datajek.spring.basics.movierecommendersystem.lesson2;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
	}

}
