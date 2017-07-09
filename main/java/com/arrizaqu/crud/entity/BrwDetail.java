package com.arrizaqu.crud.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_R_BRW_Detail")
public class BrwDetail {
	@Id
	@GeneratedValue
	private int Id;
	private int CreatedBy;
	private Date CreatedOn;
	private int ModifiedBy;
	private Date ModifiedOn;
	private int IDBukuu;
	
	@ManyToOne
	@JoinColumn(name="HeaderID")
	private HeaderPinjaman brwheader;
	
	@ManyToOne
	@JoinColumn(name="IDBuku")
	private Buku buku;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(int createdBy) {
		CreatedBy = createdBy;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	public int getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return ModifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		ModifiedOn = modifiedOn;
	}

	public int getIDBukuu() {
		return IDBukuu;
	}

	public void setIDBukuu(int iDBukuu) {
		IDBukuu = iDBukuu;
	}

	public HeaderPinjaman getBrwheader() {
		return brwheader;
	}

	public void setBrwheader(HeaderPinjaman brwheader) {
		this.brwheader = brwheader;
	}

	public Buku getBuku() {
		return buku;
	}

	public void setBuku(Buku buku) {
		this.buku = buku;
	}
}
