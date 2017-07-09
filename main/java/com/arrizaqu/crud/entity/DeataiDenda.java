package com.arrizaqu.crud.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DeataiDenda {
	@Id
	@GeneratedValue
	private int ID;
	@Column(name="IDBuku", nullable=true)
	private int IDBuku;
	@Column(name="cretedBy", nullable=true)
	private int CreatedBy;
	@Column(name="Jumlah", nullable=true)
	private int Jumlah;
	@Column(name="modifiedBy", nullable=true)
	private int ModifiedBy;
	@Column(name="CreatedOn", nullable=true)
	private Date CreatedOn;
	@Column(name="ModifiedOn", nullable=true)
	private Date ModifiedOn;

	@ManyToOne
	@JoinColumn(name="Id_header")
	private HeaderDenda header;

	/*@ManyToOne 
	@JoinColumn(name="id_Buku")
	private Buku buku;
*/
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getIDBuku() {
		return IDBuku;
	}

	public void setIDBuku(int iDBuku) {
		IDBuku = iDBuku;
	}

	public int getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(int createdBy) {
		CreatedBy = createdBy;
	}

	public int getJumlah() {
		return Jumlah;
	}

	public void setJumlah(int jumlah) {
		Jumlah = jumlah;
	}

	public int getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	public Date getModifiedOn() {
		return ModifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		ModifiedOn = modifiedOn;
	}

	public HeaderDenda getHeader() {
		return header;
	}

	public void setHeader(HeaderDenda header) {
		this.header = header;
	}

	/*public Buku getBuku() {
		return buku;
	}

	public void setBuku(Buku buku) {
		this.buku = buku;
	}*/

	
}
