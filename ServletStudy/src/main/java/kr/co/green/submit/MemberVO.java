package kr.co.green.submit;

public class MemberVO {
	private String userName;
	private String email;
	private String password;
	private String food;
	private String[] animal;
	
	MemberVO(String userName) {
		this.userName = userName;
	}
	
	public String getFood() {
		return food;
	}
	
	public String[] getAnimal() {
		return animal;
	}
	
	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}


	public String getUserName() {
		return userName;
	}

}
