package org.won.domain;

public class PinfoVO {
	
	private int pino;
	private int pno;
	private String picolor, pisize;
	private int pistock;
	public int getPino() {
		return pino;
	}
	public void setPino(int pino) {
		this.pino = pino;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPicolor() {
		return picolor;
	}
	public void setPicolor(String picolor) {
		this.picolor = picolor;
	}
	public String getPisize() {
		return pisize;
	}
	public void setPisize(String pisize) {
		this.pisize = pisize;
	}
	public int getPistock() {
		return pistock;
	}
	public void setPistock(int pistock) {
		this.pistock = pistock;
	}
	@Override
	public String toString() {
		return "PinfoVO [pino=" + pino + ", pno=" + pno + ", picolor=" + picolor + ", pisize=" + pisize + ", pistock="
				+ pistock + "]";
	}
	
	
	

}
