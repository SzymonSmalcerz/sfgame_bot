package configuration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.*;

public class Configuration {
	private static Configuration instance;
	private String mongoURI;
	
	private Configuration() throws IOException {
		File file = new File("resources/configuration.json"); 
		  
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		
		String jsonString = "";
		String st; 
		while ((st = br.readLine()) != null) {
			jsonString += st;
		}
		
		JSONObject obj = new JSONObject(jsonString);
		
		this.mongoURI = obj.getString("mongoURI");

		System.out.println(this.mongoURI);
	}
	
	public static Configuration getInstance() throws IOException {
		if(instance == null) {
			instance = new Configuration();
		}
		
		return instance;
	}

	public String getMongoURI() {
		return mongoURI;
	}

	public void setMongoURI(String mongoURI) {
		this.mongoURI = mongoURI;
	}
	
	
}
