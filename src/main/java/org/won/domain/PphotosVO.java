package org.won.domain;

public class PphotosVO {
	   
	   private Integer pno;
	   private String pphoto;
	   
	   public Integer getPno() {
	      return pno;
	   }
	   public void setPno(Integer pno) {
	      this.pno = pno;
	   }
	   public String getPphoto() {
	      return pphoto;
	   }
	   public void setPphoto(String pphoto) {
	      this.pphoto = pphoto;
	   }
	   
	   @Override
	   public String toString() {
	      return "PphotosVO [pno=" + pno + ", pphoto=" + pphoto + "]";
	   }
	   
	}