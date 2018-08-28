package com.roomservice.entity;

public class PushInfo {

	private String hotelCode;
	private String bookingLimit;
	private String invTypeCode;
	private String ratePlanCode;
	private String price;
	private String status;
	
	public String getHotelCode() {
		return hotelCode;
	}
	
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	
	public String getBookingLimit() {
		return bookingLimit;
	}

	public void setBookingLimit(String bookingLimit) {
		this.bookingLimit = bookingLimit;
	}

	public String getInvTypeCode() {
		return invTypeCode;
	}

	public void setInvTypeCode(String invTypeCode) {
		this.invTypeCode = invTypeCode;
	}

	public String getRatePlanCode() {
		return ratePlanCode;
	}

	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PushInfo [hotelCode=" + hotelCode + ", bookingLimit=" + bookingLimit + ", invTypeCode=" + invTypeCode
				+ ", ratePlanCode=" + ratePlanCode + ", price=" + price + ", status=" + status + "]";
	}

}
