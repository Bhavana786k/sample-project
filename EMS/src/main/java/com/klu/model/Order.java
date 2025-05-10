package com.klu.model;

import jakarta.persistence.*; // Entity , Table

@Entity
@Table(name="order_ems")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int oid;
	@Column(name="o_price")
	int oprice;
	@Column(name="o_mode")
	String omode;
	
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getOprice() {
		return oprice;
	}
	public void setOprice(int oprice) {
		this.oprice = oprice;
	}
	public String getOmode() {
		return omode;
	}
	public void setOmode(String omode) {
		this.omode = omode;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oprice=" + oprice + ", omode=" + omode + "]";
	}
	

}
