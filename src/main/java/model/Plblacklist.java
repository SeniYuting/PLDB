package model;

public class Plblacklist {

	private int blid;
	private String carlicence;
	private String reason;
	private String type;
	private int identity;

	public Plblacklist() {
	}

	public Plblacklist(int blid, String carlicence, String reason, String type,
			int identity) {
		this.blid = blid;
		this.carlicence = carlicence;
		this.reason = reason;
		this.type = type;
		this.identity = identity;
	}

	public int getBlid() {
		return blid;
	}

	public void setBlid(int blid) {
		this.blid = blid;
	}

	public String getCarlicence() {
		return carlicence;
	}

	public void setCarlicence(String carlicence) {
		this.carlicence = carlicence;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
