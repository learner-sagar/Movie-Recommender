package io.datajek.spring.basics.movierecommendersystem.lesson9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements Filter{
	private static int instances = 0;
	
	@Autowired
	private Movie movie;
	
	public ContentBasedFilter() {
		instances++;
		System.out.println("ContentBasedFilter constructor called");
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public static int getInstances() {
		return ContentBasedFilter.instances;
	}
	
	public String[] getRecommendations(String movie) {
		//logic of content based filter
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}
}
