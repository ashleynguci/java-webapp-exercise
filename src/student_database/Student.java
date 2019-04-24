package student_database;

public class Student {
	private int id;
	private String lastname;
	private String firstname;
	private String street;
	private String postoffice;
	private int postcode;
	public Student() {
		id = -1;
		lastname="";
		firstname="";
		street="";
		postcode = -1;
		postoffice="";
	}
	public Student(int id, String lastname, String firstname, String street, int postcode,String postoffice) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.street = street;
		this.postoffice = postoffice;
		this.postcode = postcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	
}
