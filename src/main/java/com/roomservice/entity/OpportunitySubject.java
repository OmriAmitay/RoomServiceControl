package com.roomservice.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class OpportunitySubject implements Cloneable {
	
	@NotNull
	private Long opportunityId;
	@NotNull
	private String entityType;
	@NotNull
	private Integer entityId;
	@NotNull
	private String arrival;
	@NotNull
	private String departure;
	private int numOfNights;
	@NotNull
	private String board;
	private Double price;
	@NotNull
	private Operator operator;
	@NotNull
	private Currency currency;
	private Filter filter;
	private boolean payAtTheHotel;
	private boolean onRequest;
	private boolean showSpecialDeals;
	private boolean getPackageRates;
	@NotNull
	private String countryCode;
	@NotNull
	@Min(2)
	@Max(4)
	private String adultsCount;
	@NotNull
	private String defaultCurrency;
	private boolean push;
	@NotNull
	private PushInfo pushInfo;
	private boolean active;
	
	public Long getOpportunityId() {
		return opportunityId;
	}

	public void setOpportunityId(Long opportunityId) {
		this.opportunityId = opportunityId;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getNumOfNights() {
		return numOfNights;
	}

	public void setNumOfNights(int numOfNights) {
		this.numOfNights = numOfNights;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public boolean isPayAtTheHotel() {
		return payAtTheHotel;
	}

	public void setPayAtTheHotel(boolean payAtTheHotel) {
		this.payAtTheHotel = payAtTheHotel;
	}

	public boolean isOnRequest() {
		return onRequest;
	}

	public void setOnRequest(boolean onRequest) {
		this.onRequest = onRequest;
	}

	public boolean isShowSpecialDeals() {
		return showSpecialDeals;
	}

	public void setShowSpecialDeals(boolean showSpecialDeals) {
		this.showSpecialDeals = showSpecialDeals;
	}

	public boolean isGetPackageRates() {
		return getPackageRates;
	}

	public void setGetPackageRates(boolean getPackageRates) {
		this.getPackageRates = getPackageRates;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAdultsCount() {
		return adultsCount;
	}

	public void setAdultsCount(String adultsCount) {
		this.adultsCount = adultsCount;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	
	public boolean isPush() {
		return push;
	}

	public void setPush(boolean push) {
		this.push = push;
	}

	public Object clone()throws CloneNotSupportedException {  
		return super.clone();  
	}
	
	public PushInfo getPushInfo() {
		return pushInfo;
	}

	public void setPushInfo(PushInfo pushInfo) {
		this.pushInfo = pushInfo;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "OpportunitySubject [opportunityId=" + opportunityId + ", entityType=" + entityType + ", entityId="
				+ entityId + ", arrival=" + arrival + ", departure=" + departure + ", numOfNights=" + numOfNights
				+ ", board=" + board + ", price=" + price + ", operator=" + operator + ", currency=" + currency
				+ ", filter=" + filter + ", payAtTheHotel=" + payAtTheHotel + ", onRequest=" + onRequest
				+ ", showSpecialDeals=" + showSpecialDeals + ", getPackageRates=" + getPackageRates + ", countryCode="
				+ countryCode + ", adultsCount=" + adultsCount + ", defaultCurrency=" + defaultCurrency + ", push="
				+ push + ", pushInfo=" + pushInfo + ", active=" + active + "]";
	}

	public static void main(String[] args) {

		OpportunitySubject opportunity = new OpportunitySubject();

		/*opportunity.setOpportunityId(1l);
		opportunity.setEntityType(EntityTypeEnum.LOCATION.name().toLowerCase());
		opportunity.setEntityId(4223);
		opportunity.setArrival("2018-02-03");
		opportunity.setDeparture("2018-02-04");
		opportunity.setNumOfNights(1);
		opportunity.setBoard(BoardEnum.BB.name().toUpperCase());
		opportunity.setPrice(100d);
		opportunity.setOperator(Operator.LTE);
		opportunity.setCurrency(Currency.USD);
		opportunity.setFilter(Filter.FREE_CANCELATION);

		opportunity.setPayAtTheHotel(true);
		opportunity.setOnRequest(true);
		opportunity.setShowSpecialDeals(true);
		opportunity.setGetPackageRates(true);

		opportunity.setCountryCode("IL");
		opportunity.setAdultsCount("2");
		opportunity.setDefaultCurrency("USD");
		opportunity.setPush(true);*/

	}
	
	
}
