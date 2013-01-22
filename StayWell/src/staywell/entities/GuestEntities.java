package staywell.entities;

public class GuestEntities {
	private String membershipNo;
	private String membership;
	private int point;
	private int roomNumber;
	private double cost;
	
	public String getMembershipNo() {
		return membershipNo;
	}
	public void getMembershipNo(String membershipNo) {
		this.membershipNo = membershipNo;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public int getPoints() {
		return point;
	}
	public void setPoint(int points) {
		this.point = points;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
