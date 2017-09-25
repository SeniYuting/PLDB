package model;

public class Plsysuser {

	private String acct;
	private String passw;
	private String type;
	private String name;
	private String phone;
	private int identity;

	public Plsysuser() {
	}

	public Plsysuser(String acct, String passw, String type, String name,
			String phone, int identity) {
		this.acct = acct;
		this.passw = passw;
		this.type = type;
		this.name = name;
		this.phone = phone;
		this.identity = identity;
	}

	public String getAcct() {
		return acct;
	}

	public void setAcct(String acct) {
		this.acct = acct;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
