package kr.co.green.submit;

public class MemberDTO {
	private String userName;
	private String email;
	private String password;
	private String food;
	private String[] animal;
	
	
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String[] getAnimal() {
		return animal;
	}

	public void setAnimal(String[] animal) {
		this.animal = animal;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

}
