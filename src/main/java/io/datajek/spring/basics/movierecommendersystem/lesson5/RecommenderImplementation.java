package io.datajek.spring.basics.movierecommendersystem.lesson5;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {
	
	//use filter interface to select filter
	@Autowired
    private Filter contentBasedFilter;
 
    public String [] recommendMovies (String movie) {       
        System.out.println("\nName of the filter in use: " + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        return results;
   }
}
