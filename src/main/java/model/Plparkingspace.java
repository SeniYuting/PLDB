package model;

public class Plparkingspace {

	private int pspaceid;
	private String resstatus;
	private String cartype;
	private int ps_sid;
	private int pc_tid;
	private int identity;

	public Plparkingspace() {
	}

	public Plparkingspace(int pspaceid, String resstatus, String cartype,
			int ps_sid, int pc_tid, int identity) {
		this.pspaceid = pspaceid;
		this.resstatus = resstatus;
		this.cartype = cartype;
		this.ps_sid = ps_sid;
		this.pc_tid = pc_tid;
		this.identity = identity;
	}

	public int getPspaceid() {
		return pspaceid;
	}

	public void setPspaceid(int pspaceid) {
		this.pspaceid = pspaceid;
	}

	public String getResstatus() {
		return resstatus;
	}

	public void setResstatus(String resstatus) {
		this.resstatus = resstatus;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public int getPs_sid() {
		return ps_sid;
	}

	public void setPs_sid(int ps_sid) {
		this.ps_sid = ps_sid;
	}

	public int getPc_tid() {
		return pc_tid;
	}

	public void setPc_tid(int pc_tid) {
		this.pc_tid = pc_tid;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
