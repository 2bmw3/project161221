package org.won.domain;

import java.util.List;

public class PphotosVO {

	private int pno;
	private List<String> pphoto;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public List<String> getPphoto() {
		return pphoto;
	}

	public void setPphoto(List<String> pphoto) {
		this.pphoto = pphoto;
	}

	@Override
	public String toString() {
		return "PphotosVO [pno=" + pno + ", pphoto=" + pphoto + "]";
	}

}