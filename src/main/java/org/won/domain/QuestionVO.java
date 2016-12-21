package org.won.domain;

import java.util.Date;

public class QuestionVO {
	private int qno, pno;
	private String qcontent, qwriter, qpw;
	private Date qregdate;

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public String getQwriter() {
		return qwriter;
	}

	public void setQwriter(String qwriter) {
		this.qwriter = qwriter;
	}

	public String getQpw() {
		return qpw;
	}

	public void setQpw(String qpw) {
		this.qpw = qpw;
	}

	public Date getQregdate() {
		return qregdate;
	}

	public void setQregdate(Date qregdate) {
		this.qregdate = qregdate;
	}

	@Override
	public String toString() {
		return "QuestionVO [qno=" + qno + ", pno=" + pno + ", qcontent=" + qcontent + ", qwriter=" + qwriter + ", qpw="
				+ qpw + ", qregdate=" + qregdate + "]";
	}

}
