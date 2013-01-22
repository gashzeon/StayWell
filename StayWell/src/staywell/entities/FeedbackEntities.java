package staywell.entities;

public class FeedbackEntities {
	private String houseKeeping;
	private String facilities;
	private String staff;
	private String overall;
	private String membershipNo;
	
	public String getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(String membershipNo) {
		this.membershipNo = membershipNo;
	}
	public String getHouseKeeping() {
		return houseKeeping;
	}
	public void setHouseKeeping(String houseKeeping) {
		this.houseKeeping = houseKeeping;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getOverall() {
		return overall;
	}
	public void setOverall(String overall) {
		this.overall = overall;
	}
}
