
public class UserAccount {
	String email;
	String userName;
	String password;
	int birthOfYear;
	
	public UserAccount(String email,String userName, String password, int birthOfYear) {
		this.email=email;
		this.userName=userName;
		this.password=password;
		this.birthOfYear=birthOfYear;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public int getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	public void addUser() {
		
	}
	public void printUserInfo(){
        System.out.println("User Name: " + userName);
        System.out.println("Birth Of Year: " + birthOfYear);
        System.out.println();
    }

	
	
}
