package io.datajek.spring.basics.movierecommendersystem.lesson7;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class RecommenderImplementation {
	
	//use filter interface to select filter
    private Filter filter;
	
	@Autowired
	public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
	    this.filter = filter;
	    System.out.println("Constructor invoked...");
	}
	
    public String [] recommendMovies (String movie) {       
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
   }
}
