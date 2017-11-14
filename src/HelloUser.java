
public class HelloUser {
	
	private String username;
	
	public HelloUser (String username) {
		this.username = username;
	}
	
	public void greetUser() {
		StringBuilder stringBuilder = new StringBuilder("Hello ");
		stringBuilder.append(getUsername());
		stringBuilder.append("!");
		System.out.println(stringBuilder.toString());
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
