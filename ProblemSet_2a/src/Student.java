
public class Student {
	private String forename;
	private String surname;
	private Integer age;
	
	public Integer getAge(){
		return age;
	}
	public String getFullName() {
		return forename + surname;
	}
	public void setAge(Integer newAge) {
		age = newAge;
	}
	public void setForename(String newForename) {
		forename = newForename;
	}
	public void setSurname(String newSurname) {
		surname = newSurname;
	}
}
