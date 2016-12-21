package org.won.domain;

import java.util.Date;

public class MemberVO {

	private String userid, userpw, uname, uaddress, uemail, uphonenumber, ugender;
	private Date uregdate, ubirth;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphonenumber() {
		return uphonenumber;
	}

	public void setUphonenumber(String uphonenumber) {
		this.uphonenumber = uphonenumber;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public Date getUregdate() {
		return uregdate;
	}

	public void setUregdate(Date uregdate) {
		this.uregdate = uregdate;
	}

	public Date getUbirth() {
		return ubirth;
	}

	public void setUbirth(Date ubirth) {
		this.ubirth = ubirth;
	}

	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", uname=" + uname + ", uaddress=" + uaddress
				+ ", uemail=" + uemail + ", uphonenumber=" + uphonenumber + ", ugender=" + ugender + ", uregdate="
				+ uregdate + ", ubirth=" + ubirth + "]";
	}

}
