package staywell.entities;

public class Ballroom {
	private String name;
	private String type;
	private String date;
	private String timeStart;
	private String timeEnd;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTimeStart(){
		return timeStart;
	}
	public void setTimeStart(String timeStart){
		this.timeStart = timeStart;
	}
	public String getTimeEnd(){
		return timeEnd;
	}
	public void setTimeEnd(String timeEnd){
		this.timeEnd = timeEnd;
	}
}
