package model;

public class SMVO {

	String id;
	String pw;
	String name;
	int age;
	int goal_time;
	String user_id;
	public SMVO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SMVO() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGoaltime(int goal_time) {
		this.goal_time = goal_time;
	}
	public void setUserid(String user_id) {
		this.user_id= user_id;
		
		
	}
}//2
