package model;

import java.sql.Date;

public class Plparkingcar {

	private int tid;
	private String carlicence;
	private String cartype;
	private String carcolor;
	private Date itime;
	private String code;
	private int pickcount;
	private int identity;

	public Plparkingcar() {
	}

	public Plparkingcar(int tid, String carlicence, String cartype,
			String carcolor, Date itime, String code, int pickcount,
			int identity) {
		this.tid = tid;
		this.carlicence = carlicence;
		this.cartype = cartype;
		this.carcolor = carcolor;
		this.itime = itime;
		this.code = code;
		this.pickcount = pickcount;
		this.identity = identity;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPickcount() {
		return pickcount;
	}

	public void setPickcount(int pickcount) {
		this.pickcount = pickcount;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
