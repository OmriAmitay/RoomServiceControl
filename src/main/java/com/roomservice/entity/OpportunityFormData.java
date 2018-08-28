package com.roomservice.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class OpportunityFormData {

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
	@NotNull
	private Integer numOfNights = 1;
	@NotNull
	private String board;
	@NotNull
	private Double price;
	@NotNull
	private Operator operator = Operator.LTE;
	@NotNull
	private Currency currency = Currency.USD;
	@NotNull
	private Filter filter = Filter.FREE_CANCELATION;
	@NotNull
	private Boolean payAtTheHotel = false;
	@NotNull
	private Boolean onRequest = false;
	@NotNull
	private Boolean showSpecialDeals = false;
	@NotNull
	private Boolean getPackageRates = false;
	@NotNull
	private String countryCode;
	@NotNull
	@Min(2)
	@Max(4)
	private Integer adultsCount = 2;
	@NotNull
	private String defaultCurrency = Currency.USD.name();
	@NotNull
	private Boolean active = true;
	@NotNull
	private Boolean push;
	@NotNull
    private PushInfo pushInfo;
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
	public Integer getNumOfNights() {
		return numOfNights;
	}
	public void setNumOfNights(Integer numOfNights) {
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
	public Boolean getPayAtTheHotel() {
		return payAtTheHotel;
	}
	public void setPayAtTheHotel(Boolean payAtTheHotel) {
		this.payAtTheHotel = payAtTheHotel;
	}
	public Boolean getOnRequest() {
		return onRequest;
	}
	public void setOnRequest(Boolean onRequest) {
		this.onRequest = onRequest;
	}
	public Boolean getShowSpecialDeals() {
		return showSpecialDeals;
	}
	public void setShowSpecialDeals(Boolean showSpecialDeals) {
		this.showSpecialDeals = showSpecialDeals;
	}
	public Boolean getGetPackageRates() {
		return getPackageRates;
	}
	public void setGetPackageRates(Boolean getPackageRates) {
		this.getPackageRates = getPackageRates;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Integer getAdultsCount() {
		return adultsCount;
	}
	public void setAdultsCount(Integer adultsCount) {
		this.adultsCount = adultsCount;
	}
	public String getDefaultCurrency() {
		return defaultCurrency;
	}
	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	public Boolean getPush() {
		return push;
	}
	public void setPush(Boolean push) {
		this.push = push;
	}
	public PushInfo getPushInfo() {
		return pushInfo;
	}
	public void setPushInfo(PushInfo pushInfo) {
		this.pushInfo = pushInfo;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
    
}