package sunbeam.pojo;

import java.sql.Date;

public class Customer {
	private int id;
	private String customerName; 
	private String customerAddress; 
	private String contactNo; 
	private Date date;
	private String sareeQty;
	private String sareeRate;
	private String sareeTotal; 
	private String shirtQty;
	private String shirtRate;
	private String shirtTotal;
	private String pantQty;
	private String pantRate;
	private String pantTotal;
	private String topQty;
	private String topRate; 
	private String topTotal;
	private String jeansQty;
	private String jeansRate;
	private String jeansTotal; 
	private String clothQty;
	private String clothRate;
	private String clothTotal; 
	private String finalTotal;

	public Customer() {
	}

	
	
	public Customer(int id, String customerName, String customerAddress, String contactNo, Date date, String sareeQty,
			String sareeRate, String sareeTotal, String shirtQty, String shirtRate, String shirtTotal, String pantQty,
			String pantRate, String pantTotal, String topQty, String topRate, String topTotal, String jeansQty,
			String jeansRate, String jeansTotal, String clothQty, String clothRate, String clothTotal,
			String finalTotal) {
	
		this.id = id;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contactNo = contactNo;
		this.date = date;
		this.sareeQty = sareeQty;
		this.sareeRate = sareeRate;
		this.sareeTotal = sareeTotal;
		this.shirtQty = shirtQty;
		this.shirtRate = shirtRate;
		this.shirtTotal = shirtTotal;
		this.pantQty = pantQty;
		this.pantRate = pantRate;
		this.pantTotal = pantTotal;
		this.topQty = topQty;
		this.topRate = topRate;
		this.topTotal = topTotal;
		this.jeansQty = jeansQty;
		this.jeansRate = jeansRate;
		this.jeansTotal = jeansTotal;
		this.clothQty = clothQty;
		this.clothRate = clothRate;
		this.clothTotal = clothTotal;
		this.finalTotal = finalTotal;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSareeQty() {
		return sareeQty;
	}

	public void setSareeQty(String sareeQty) {
		this.sareeQty = sareeQty;
	}

	public String getSareeRate() {
		return sareeRate;
	}

	public void setSareeRate(String sareeRate) {
		this.sareeRate = sareeRate;
	}

	public String getSareeTotal() {
		return sareeTotal;
	}

	public void setSareeTotal(String sareeTotal) {
		this.sareeTotal = sareeTotal;
	}

	public String getShirtQty() {
		return shirtQty;
	}

	public void setShirtQty(String shirtQty) {
		this.shirtQty = shirtQty;
	}

	public String getShirtRate() {
		return shirtRate;
	}

	public void setShirtRate(String shirtRate) {
		this.shirtRate = shirtRate;
	}

	public String getShirtTotal() {
		return shirtTotal;
	}

	public void setShirtTotal(String shirtTotal) {
		this.shirtTotal = shirtTotal;
	}

	public String getPantQty() {
		return pantQty;
	}

	public void setPantQty(String pantQty) {
		this.pantQty = pantQty;
	}

	public String getPantRate() {
		return pantRate;
	}

	public void setPantRate(String pantRate) {
		this.pantRate = pantRate;
	}

	public String getPantTotal() {
		return pantTotal;
	}

	public void setPantTotal(String pantTotal) {
		this.pantTotal = pantTotal;
	}

	public String getTopQty() {
		return topQty;
	}

	public void setTopQty(String topQty) {
		this.topQty = topQty;
	}

	public String getTopRate() {
		return topRate;
	}

	public void setTopRate(String topRate) {
		this.topRate = topRate;
	}

	public String getTopTotal() {
		return topTotal;
	}

	public void setTopTotal(String topTotal) {
		this.topTotal = topTotal;
	}

	public String getJeansQty() {
		return jeansQty;
	}

	public void setJeansQty(String jeansQty) {
		this.jeansQty = jeansQty;
	}

	public String getJeansRate() {
		return jeansRate;
	}

	public void setJeansRate(String jeansRate) {
		this.jeansRate = jeansRate;
	}

	public String getJeansTotal() {
		return jeansTotal;
	}

	public void setJeansTotal(String jeansTotal) {
		this.jeansTotal = jeansTotal;
	}

	public String getClothQty() {
		return clothQty;
	}

	public void setClothQty(String clothQty) {
		this.clothQty = clothQty;
	}

	public String getClothRate() {
		return clothRate;
	}

	public void setClothRate(String clothRate) {
		this.clothRate = clothRate;
	}

	public String getClothTotal() {
		return clothTotal;
	}

	public void setClothTotal(String clothTotal) {
		this.clothTotal = clothTotal;
	}

	public String getFinalTotal() {
		return finalTotal;
	}

	public void setFinalTotal(String finalTotal) {
		this.finalTotal = finalTotal;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", contactNo=" + contactNo + ", date=" + date + ", sareeQty=" + sareeQty + ", sareeRate=" + sareeRate
				+ ", sareeTotal=" + sareeTotal + ", shirtQty=" + shirtQty + ", shirtRate=" + shirtRate + ", shirtTotal="
				+ shirtTotal + ", pantQty=" + pantQty + ", pantRate=" + pantRate + ", pantTotal=" + pantTotal
				+ ", topQty=" + topQty + ", topRate=" + topRate + ", topTotal=" + topTotal + ", jeansQty=" + jeansQty
				+ ", jeansRate=" + jeansRate + ", jeansTotal=" + jeansTotal + ", clothQty=" + clothQty + ", clothRate="
				+ clothRate + ", clothTotal=" + clothTotal + ", finalTotal=" + finalTotal + "]";
	}




}
