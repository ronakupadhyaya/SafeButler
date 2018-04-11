package database;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

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
		connect("mongodb://user:user@ds121945.mlab.com:21945/safebutler");

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
		connect("mongodb://user:user@ds121945.mlab.com:21945/safebutler");
		
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
		connect("mongodb://user:user@ds121945.mlab.com:21945/safebutler");

		String time = quote.getTime();
		String price = quote.getPrice();
		String date = quote.getDate();
		
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("quotes");
		Document mongoDocument = new Document("time", time)
									  .append("price", price)
									  .append("date", date);
		mongoCollection.insertOne(mongoDocument);
	}
	
	public static ArrayList<Quote> getQuotes() {
		ArrayList<Quote> quotes = new ArrayList<Quote>();
		connect("mongodb://user:user@ds121945.mlab.com:21945/safebutler");
		
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("quotes");
		MongoCursor<Document> mongoCursor = mongoCollection.find().iterator();
		try {
			while (mongoCursor.hasNext()) {
				Document mongoDocument = mongoCursor.next();
				Quote quote = new Quote();
				quote.setTime((String)mongoDocument.get("time"));
				quote.setPrice((String)mongoDocument.get("price"));
				quote.setDate((String)mongoDocument.get("date"));
				quotes.add(quote);
			}
		} finally {
			mongoCursor.close();
		}
		
		return quotes;	
	}
	
	public static void removeUser(String name) {
		connect("mongodb://user:user@ds121945.mlab.com:21945/safebutler");
		
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("users");	
		Document removeQuery = new Document("name", new Document("$eq", name));
		mongoCollection.findOneAndDelete(removeQuery);
	}
	
	public static void main(String[] args) {
		Quote quote1 = new Quote("4/2018", "620", "54");
		Quote quote2 = new Quote("4/2018", "625", "54");
		Quote quote3 = new Quote("4/2018", "5005", "45");
		addQuote(quote1);
		addQuote(quote2);
		addQuote(quote3);
	}
	
}
