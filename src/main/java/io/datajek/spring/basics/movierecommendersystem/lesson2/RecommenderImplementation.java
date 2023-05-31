package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
	
	//use filter interface to select filter
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
