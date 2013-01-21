package staywell.entities;

public class TaxiEntities {
	private String name;
	private String taxiNumber;
	private String bookingNo;
	private String time;
	private String ETA;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaxiNumber(){
		return taxiNumber;
	}
	public void setTaxiNo(String taxiNo){
		this.taxiNumber = taxiNo;
	}
	public String getBookingNo(){
		return bookingNo;
	}
	public void setBookingNo(String bookingNo){
		this.bookingNo = bookingNo;
	}
	public String getTime(){
		return time;
	}
	public void setTime(String time){
		this.time = time;
	}
	public String getETA(){
		return ETA;
	}
	public void setETA(String ETA){
		this.ETA = ETA;
	}
}
