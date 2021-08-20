package entitites;

public class Rent {

	private String name, email;

	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void addName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void addEmail(String email) {
		this.email = email;
	}

}
