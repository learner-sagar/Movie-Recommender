package io.datajek.spring.basics.movierecommendersystem.lesson8;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class RecommenderImplementation2 {
	
	//use filter interface to select filter
	@Autowired
    private Filter filter;
	
	@Autowired
	@Qualifier("contentBasedFilter")
	public void setFilter(Filter filter) {
	    this.filter = filter;
	    System.out.println("Setter method invoked..");
	}
 
    public String [] recommendMovies (String movie) {       
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
   }
}
