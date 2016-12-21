package org.won.domain;

public class CartVO {
	   
	   private Integer cno;
	   private Integer tno;
	   private String userid;
	   
	   public Integer getCno() {
	      return cno;
	   }
	   public void setCno(Integer cno) {
	      this.cno = cno;
	   }
	   public Integer getTno() {
	      return tno;
	   }
	   public void setTno(Integer tno) {
	      this.tno = tno;
	   }
	   public String getUserid() {
	      return userid;
	   }
	   public void setUserid(String userid) {
	      this.userid = userid;
	   }
	   
	   @Override
	   public String toString() {
	      return "CartVO [cno=" + cno + ", tno=" + tno + ", userid=" + userid + "]";
	   }

	}