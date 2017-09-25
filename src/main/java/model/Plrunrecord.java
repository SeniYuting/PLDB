package model;

import java.sql.Date;

public class Plrunrecord {

	private int id;
	private Date time;
	private int spaceid;
	private int status;
	private int step;
	private int identity;

	public Plrunrecord() {
	}

	public Plrunrecord(int id, Date time, int spaceid, int status, int step,
			int identity) {
		this.id = id;
		this.time = time;
		this.spaceid = spaceid;
		this.status = status;
		this.step = step;
		this.identity = identity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getSpaceid() {
		return spaceid;
	}

	public void setSpaceid(int spaceid) {
		this.spaceid = spaceid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
