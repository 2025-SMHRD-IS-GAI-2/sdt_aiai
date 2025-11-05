package model;

public class UserVO {
	
	String user_id;
	String pw;
	String name;
	int age;
	
	public UserVO(String user_id, String pw, String name, int age) {
		super();
		this.user_id = user_id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public UserVO() {
		super();
	}

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
	
	
	

}
