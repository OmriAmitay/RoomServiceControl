
package com.roomservice.dao;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.roomservice.entity.LifeCycle;
import com.roomservice.entity.OpportunityFormData;

public class MongoDao {

	private final static Logger LOG = Logger.getLogger(MongoDao.class);
	public static final String MONGO_URI = "mongodb://localhost";
	public static final String MONGO_DATABASE = "roomservice";

	public static MongoDao instance;

	private MongoCollection<Document> bookingCollection;
	private MongoCollection<Document> opportunityCollection;
	private MongoDatabase roomServiceDataBase;
	private MongoClient mongoClient;

	private Random random = new Random();
	private static float PRINT_THRESHOLD = 0.10f;

	public static MongoDao getInstance() {

		if (instance == null) {

			synchronized (MongoDao.class) {

				if (instance == null) {
					instance = new MongoDao();
				}
			}
		}

		return instance;
	}

	private MongoDao() {
		mongoClient = new MongoClient(new MongoClientURI(MONGO_URI));
		roomServiceDataBase = mongoClient.getDatabase(MONGO_DATABASE);
		bookingCollection = roomServiceDataBase.getCollection("booking");
		opportunityCollection = roomServiceDataBase.getCollection("opportunity");
	}

	public void updateBooking(LifeCycle lifeCycle, String reservationId) {
		Document filter = new Document("reservationId", reservationId);
		Document document = new Document("lifeCycle", lifeCycle.name());
		bookingCollection.updateOne(filter, new Document("$set", document));
	}

	public boolean importOpportunity(OpportunityFormData data) {

		boolean isValid = false;
		
		LOG.trace("Inserting Opportunity Entry: " + data);

		try {
			Document document = new Document("entity_type", data.getEntityType())
					.append("entity_id", data.getEntityId())
					.append("opportunity_id", data.getOpportunityId())
					.append("arrival", data.getArrival())
					.append("departure", data.getDeparture())
					.append("num_of_nights", data.getNumOfNights())
					.append("board", data.getBoard())
					.append("price", data.getPrice())
					.append("operator", data.getOperator().name())
					.append("filter", data.getFilter().name())
					.append("currency", data.getCurrency().name())
					.append("is_pay_at_the_hotel", data.getPayAtTheHotel())
					.append("is_on_request", data.getOnRequest())
					.append("is_show_special_deals", data.getShowSpecialDeals())
					.append("is_get_package_rates", data.getGetPackageRates())
					.append("country_code", data.getCountryCode())
					.append("default_currency", data.getDefaultCurrency())
					.append("adults_count", data.getAdultsCount())
					.append("is_push", data.getPush())
					.append("hotel_code", data.getPushInfo().getHotelCode())
					.append("booking_limit", data.getPushInfo().getBookingLimit())
					.append("inv_type_code", data.getPushInfo().getInvTypeCode())
					.append("rate_plan_code", data.getPushInfo().getRatePlanCode())
					.append("push_price", data.getPushInfo().getPrice())
					.append("status", data.getPushInfo().getStatus())
					.append("active", data.getActive());

			opportunityCollection.insertOne(document);
			isValid = true;

		} catch (Exception ex) {
			ex.printStackTrace();
			isValid = false;
		}

		return isValid;

	}

	public long getMaxOpportunityId() {
		
		Long id = 1l;
		try {
			Document doc = opportunityCollection.find().sort( new Document( "opportunity_id" , -1 ) )
				.limit(1).projection(new Document( "opportunity_id" , 1 ))
				.first();
			
			id = doc.getLong("opportunity_id");
			if(id == null) {
				return 1;
			}
		} catch (Exception e) {
			return 1;
		}
				
		return id + 1;
					
	}

}
