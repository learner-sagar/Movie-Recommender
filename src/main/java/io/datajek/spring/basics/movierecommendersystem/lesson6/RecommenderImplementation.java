package io.datajek.spring.basics.movierecommendersystem.lesson6;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class RecommenderImplementation {
	
	//use filter interface to select filter
	@Autowired
	@Qualifier("CF")
    private Filter filter;
 
    public String [] recommendMovies (String movie) {       
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
   }
}
