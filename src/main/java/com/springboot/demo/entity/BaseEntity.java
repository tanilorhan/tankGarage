package com.springboot.demo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;
	@Column(name="CreateTime")
	private Timestamp createTime;
	@Column(name="UpdateTime")
	private Timestamp updateTime;
	@Column(name="UpdatedBy")
	private String updatedBy;
	@Column(name="Deleted")
	private boolean deleted;
	
	public BaseEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public BaseEntity( Timestamp createTime, Timestamp updateTime, String updatedBy, boolean deleted) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.updatedBy = updatedBy;
		this.deleted = deleted;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	

}
