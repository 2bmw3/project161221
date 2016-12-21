package org.won.domain;

import java.util.Date;

public class OrderVO {

	private int ono;
	private String userid, ostatus;
	private Date orderDate;

	public int getOno() {
		return ono;
	}

	public void setOno(int ono) {
		this.ono = ono;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOstatus() {
		return ostatus;
	}

	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "OrderVO [ono=" + ono + ", userid=" + userid + ", ostatus=" + ostatus + ", orderDate=" + orderDate + "]";
	}

}
