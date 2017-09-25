package model;

import java.sql.Date;

public class Plparkingrecord {

	private int id;
	private String carlicense;
	private String cartype;
	private String carcolor;
	private Date itime;
	private Date otime;
	private String code;
	private double cost;
	private String payway;
	private int identity;

	public Plparkingrecord() {
	}

	public Plparkingrecord(int id, String carlicense, String cartype,
			String carcolor, Date itime, Date otime, String code, double cost,
			String payway, int identity) {
		this.id = id;
		this.carlicense = carlicense;
		this.cartype = cartype;
		this.carcolor = carcolor;
		this.itime = itime;
		this.otime = otime;
		this.code = code;
		this.cost = cost;
		this.payway = payway;
		this.identity = identity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarlicense() {
		return carlicense;
	}

	public void setCarlicense(String carlicense) {
		this.carlicense = carlicense;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}

	public Date getItime() {
		return itime;
	}

	public void setItime(Date itime) {
		this.itime = itime;
	}

	public Date getOtime() {
		return otime;
	}

	public void setOtime(Date otime) {
		this.otime = otime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPayway() {
		return payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
