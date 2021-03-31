package prob2;

public class LibraryMember {
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord myrecord;
	
	LibraryMember(String id, String fname, String lname, String phone) {
		this.memberId=id;
		this.firstName=fname;
		this.lastName=lname;
		this.phone=phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setCheckoutRecord(CheckoutRecord record) {
		myrecord = record;
	}
	
	public CheckoutRecord getCheckoutRecord() {
		return myrecord;
	}
	
	
}
