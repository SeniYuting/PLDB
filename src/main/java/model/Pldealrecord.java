package model;

import java.sql.Date;

public class Pldealrecord {

	private int id;
	private Date time;
	private String type;
	private String description;
	private String opname;
	private int identity;

	public Pldealrecord() {
	}

	public Pldealrecord(int id, Date time, String type, String description,
			String opname, int identity) {
		this.id = id;
		this.time = time;
		this.type = type;
		this.description = description;
		this.opname = opname;
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

	public String getOpname() {
		return opname;
	}

	public void setOpname(String opname) {
		this.opname = opname;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
