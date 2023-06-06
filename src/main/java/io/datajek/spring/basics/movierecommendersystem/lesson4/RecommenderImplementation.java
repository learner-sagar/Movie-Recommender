package io.datajek.spring.basics.movierecommendersystem.lesson4;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {
	
	//use filter interface to select filter
	@Autowired
    private Filter filter;
    
    public RecommenderImplementation(Filter filter) {
    	this.filter = filter;
    }
	
	public String[] recommendMovies(String movie) {
		
		//print the name of interface implementation being used
	    System.out.println("Name of the filter in use: " + filter + "\n");

	    String[] results = filter.getRecommendations(movie);
	    
        //return the results
		return results;
	}
}
