package com.medicare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer pid;
	private Integer userid;
	private Integer totalitem;
	private long totalprice;
	private String orderhistory;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getTotalitem() {
		return totalitem;
	}
	public void setTotalitem(Integer totalitem) {
		this.totalitem = totalitem;
	}
	public long getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(long totalprice) {
		this.totalprice = totalprice;
	}
	public String getOrderhistory() {
		return orderhistory;
	}
	public void setOrderhistory(String orderhistory) {
		this.orderhistory = orderhistory;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", pid=" + pid + ", userid=" + userid + ", totalitem=" + totalitem + ", totalprice="
				+ totalprice + ", orderhistory=" + orderhistory + "]";
	}

}
