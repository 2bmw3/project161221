package org.won.domain;

public class OrderDetailVO {

	private int ono, pino, ocnt;
	private String shopname;

	public int getOno() {
		return ono;
	}

	public void setOno(int ono) {
		this.ono = ono;
	}

	public int getPino() {
		return pino;
	}

	public void setPino(int pino) {
		this.pino = pino;
	}

	public int getOcnt() {
		return ocnt;
	}

	public void setOcnt(int ocnt) {
		this.ocnt = ocnt;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	@Override
	public String toString() {
		return "OrderDetailVO [ono=" + ono + ", pino=" + pino + ", ocnt=" + ocnt + ", shopname=" + shopname + "]";
	}

}
