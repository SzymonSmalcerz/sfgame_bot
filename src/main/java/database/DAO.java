package database;

import java.io.IOException;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import configuration.Configuration;

public class DAO {
	private MongoClient mongoClient;
	
	private static DAO instance;
	
	private DAO() throws IOException {
		this.mongoClient = new MongoClient(new MongoClientURI(Configuration.getInstance().getMongoURI()));
	}
	
	public static DAO getInstance() throws IOException {
		if(instance == null) {
			instance = new DAO();
		}
		
		return instance;
	}
}
