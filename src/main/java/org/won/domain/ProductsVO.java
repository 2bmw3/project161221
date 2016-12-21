package org.won.domain;

import java.util.Date;

public class ProductsVO {

	private int pno, sellcnt, price;
	private String pname, pgender, adminid, pkind, ptitlephoto, pcontent;
	private Date pregdate;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getSellcnt() {
		return sellcnt;
	}

	public void setSellcnt(int sellcnt) {
		this.sellcnt = sellcnt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPgender() {
		return pgender;
	}

	public void setPgender(String pgender) {
		this.pgender = pgender;
	}

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getPkind() {
		return pkind;
	}

	public void setPkind(String pkind) {
		this.pkind = pkind;
	}

	public String getPtitlephoto() {
		return ptitlephoto;
	}

	public void setPtitlephoto(String ptitlephoto) {
		this.ptitlephoto = ptitlephoto;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public Date getPregdate() {
		return pregdate;
	}

	public void setPregdate(Date pregdate) {
		this.pregdate = pregdate;
	}

	@Override
	public String toString() {
		return "ProductsVO [pno=" + pno + ", sellcnt=" + sellcnt + ", price=" + price + ", pname=" + pname
				+ ", pgender=" + pgender + ", adminid=" + adminid + ", pkind=" + pkind + ", ptitlephoto=" + ptitlephoto
				+ ", pcontent=" + pcontent + ", pregdate=" + pregdate + "]";
	}

}
