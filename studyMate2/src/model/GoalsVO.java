package model;

public class GoalsVO {
	
	int math_goal_time;
	int math_input_time;
	int math_accumulated_time;
	int eng_goal_time;
	int eng_input_time;
	int eng_accumulated_time;
	String user_id;
	
	public GoalsVO() {
		super();
	}

	public int getMath_goal_time() {
		return math_goal_time;
	}

	public void setMath_goal_time(int math_goal_time) {
		this.math_goal_time = math_goal_time;
	}

	public int getMath_input_time() {
		return math_input_time;
	}

	public void setMath_input_time(int math_input_time) {
		this.math_input_time = math_input_time;
	}

	public int getMath_accumulated_time() {
		return math_accumulated_time;
	}

	public void setMath_accumulated_time(int math_accumulated_time) {
		this.math_accumulated_time = math_accumulated_time;
	}

	public int getEng_goal_time() {
		return eng_goal_time;
	}

	public void setEng_goal_time(int eng_goal_time) {
		this.eng_goal_time = eng_goal_time;
	}

	public int getEng_input_time() {
		return eng_input_time;
	}

	public void setEng_input_time(int eng_input_time) {
		this.eng_input_time = eng_input_time;
	}

	public int getEng_accumulated_time() {
		return eng_accumulated_time;
	}

	public void setEng_accumulated_time(int eng_accumulated_time) {
		this.eng_accumulated_time = eng_accumulated_time;
	}
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	

}
