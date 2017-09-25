package model;

public class Plparkingsensor {

	private int sid;
	private String nodenumber;
	private String ip;
	private int identity;

	public Plparkingsensor() {
	}

	public Plparkingsensor(int sid, String nodenumber, String ip, int identity) {
		this.sid = sid;
		this.nodenumber = nodenumber;
		this.ip = ip;
		this.identity = identity;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getNodenumber() {
		return nodenumber;
	}

	public void setNodenumber(String nodenumber) {
		this.nodenumber = nodenumber;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

}
