package model;

import java.sql.Date;

public class Plmalfunctionrecord {

	private int id;
	private Date time;
	private String type;
	private String description;
	private int identity;

	public Plmalfunctionrecord() {
	}

	public Plmalfunctionrecord(int id, Date time, String type,
			String description, int identity) {
		this.id = id;
		this.time = time;
		this.type = type;
		this.description = description;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
