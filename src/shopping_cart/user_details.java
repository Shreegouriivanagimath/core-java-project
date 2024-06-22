package shopping_cart;

public class user_details {
	private String name;
	private int age;
	private String city;
	private String state;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	public String getstate() {
		return state;
	}
	public user_details(String name, int age, String city,String state) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.state= state;
	}
}

