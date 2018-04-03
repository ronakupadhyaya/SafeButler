package database;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import data.*;

public class Database {

	private static MongoClientURI mongoURI;
	private static MongoClient mongoClient;
	private static MongoDatabase mongoDatabase;
	
	public static void connect(String stringURI) {
		mongoURI = new MongoClientURI(stringURI);
		mongoClient = new MongoClient(mongoURI);
		mongoDatabase = mongoClient.getDatabase(mongoURI.getDatabase());
	} 
	
	public static void addUser(User user) {
		connect("mongodb://user:user@ds125255.mlab.com:25255/cs201");

		String name = user.getName();
		String email = user.getEmail();
		String address = user.getAddress();
		String houseOrCondo = user.getHouseOrCondo();
		String yearBuilt = user.getYearBuilt();
		String squareFootage = user.getSquareFootage();
		String roofType = user.getRoofType();
		String construction = user.getConstruction();
		String stories = user.getStories();
		String swimmingPool = user.getSwimmingPool();
		String fixtures = user.getFixtures();
		String discounts = user.getDiscounts(); 
		
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("users");
		Document mongoDocument = new Document("name", name)
									  .append("email", email)
									  .append("address", address)
									  .append("houseOrCondo", houseOrCondo)
									  .append("yearBuilt", yearBuilt)
									  .append("squareFootage", squareFootage)
									  .append("roofType", roofType)
									  .append("construction", construction)
									  .append("stories", stories)
									  .append("swimmingPool", swimmingPool)
									  .append("fixtures", fixtures)
									  .append("discounts", discounts);
		mongoCollection.insertOne(mongoDocument);
	}
	
	public static ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		connect("mongodb://user:user@ds125255.mlab.com:25255/cs201");
		
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("users");
		MongoCursor<Document> mongoCursor = mongoCollection.find().iterator();
		try {
			while (mongoCursor.hasNext()) {
				Document mongoDocument = mongoCursor.next();
				User user = new User();
				user.setName((String)mongoDocument.get("name"));
				user.setEmail((String)mongoDocument.get("email"));
				user.setHouseOrCondo((String)mongoDocument.get("houseOrCondo"));
				user.setYearBuilt((String)mongoDocument.get("yearBuilt"));
				user.setSquareFootage((String)mongoDocument.get("squareFootage"));
				user.setRoofType((String)mongoDocument.get("roofType"));
				user.setConstruction((String)mongoDocument.get("construction"));
				user.setStories((String)mongoDocument.get("stories"));
				user.setSwimmingPool((String)mongoDocument.get("swimmingPool"));
				user.setFixtures((String)mongoDocument.get("fixtures"));
				user.setDiscounts((String)mongoDocument.get("discounts"));
				users.add(user);
			}
		} finally {
			mongoCursor.close();
		}
		
		return users;	
	}
	
	public static void addQuote(Quote quote) {
		connect("mongodb://user:user@ds125255.mlab.com:25255/cs201");

		String option = quote.getOption();
		String price = quote.getPrice();
		String coverage = quote.getCoverage();
		String replacement = quote.getReplacement();
		String liability = quote.getLiability();
		String personalProperty = quote.getPersonalProperty();
		String deductible = quote.getDeductible();
		
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("quotes");
		Document mongoDocument = new Document("option", option)
									  .append("price", price)
									  .append("coverage", coverage)
									  .append("replacement", replacement)
									  .append("liability", liability)
									  .append("personalProperty", personalProperty)
									  .append("deductible", deductible);
		mongoCollection.insertOne(mongoDocument);
	}
	
}
