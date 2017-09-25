package model;

import java.sql.Date;

public class Plreserveparkinguser {

	private int userid;
	private String name;
	private String phone;
	private String carlicence;
	private String cartype;
	private Date validity;
	private int plparkingspace_pspaceid;
	private int identity;

	public Plreserveparkinguser() {
	}

	public Plreserveparkinguser(int userid, String name, String phone,
			String carlicence, String cartype, Date validity,
			int plparkingspace_pspaceid, int identity) {
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.carlicence = carlicence;
		this.cartype = cartype;
		this.validity = validity;
		this.plparkingspace_pspaceid = plparkingspace_pspaceid;
		this.identity = identity;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getCarlicence() {
		return carlicence;
	}

	public void setCarlicence(String carlicence) {
		this.carlicence = carlicence;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	public int getPlparkingspace_pspaceid() {
		return plparkingspace_pspaceid;
	}

	public void setPlparkingspace_pspaceid(int plparkingspace_pspaceid) {
		this.plparkingspace_pspaceid = plparkingspace_pspaceid;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
