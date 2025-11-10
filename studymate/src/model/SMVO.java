package model;

public class SMVO {

	String user_id;
	String pw;
	String name;
	int age;
	int math_goal_time;
	int eng_goal_time;
	int math_input_time;
	int eng_input_time;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMath_goal_time() {
		return math_goal_time;
	}
	public void setMath_goal_time(int math_goal_time) {
		this.math_goal_time = math_goal_time;
	}
	public int getEng_goal_time() {
		return eng_goal_time;
	}
	public void setEng_goal_time(int eng_goal_time) {
		this.eng_goal_time = eng_goal_time;
	}
	public SMVO(String user_id, String pw, String name, int age) {
		super();
		this.user_id = user_id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	public int getMath_input_time() {
		return math_input_time;
	}
	public void setMath_input_time(int math_input_time) {
		this.math_input_time = math_input_time;
	}
	public int getEng_input_time() {
		return eng_input_time;
	}
	public void setEng_input_time(int eng_input_time) {
		this.eng_input_time = eng_input_time;
	}

	public SMVO() {
	}
	
}
	
	
	