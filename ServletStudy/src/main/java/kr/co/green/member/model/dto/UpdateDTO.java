package kr.co.green.member.model.dto;

public class UpdateDTO {
	private String name;
	private int employeeId;
	
	public UpdateDTO(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
	
	
	
	
	
	
	
}
