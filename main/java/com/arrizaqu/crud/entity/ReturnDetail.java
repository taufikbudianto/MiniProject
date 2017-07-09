package com.arrizaqu.crud.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table (name="T_R_RETURN_DETAIL")
@Entity
public class ReturnDetail {
	@Id
	@GeneratedValue
	private int ID;
	private boolean LaporanKehilangan;
	private boolean Sudahdiganti;
	private int CreatedBy;
	private Date CreatedOn;
	private int ModifiedBy;
	private Date ModifiedOn;
	private boolean Denda;
	private boolean SudahDibayar;
	
	@ManyToOne
	@JoinColumn(name="id_header")
	private ReturnHeader header;
	
	@ManyToOne 
	@JoinColumn(name="id_Buku")
	private Buku buku;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean isLaporanKehilangan() {
		return LaporanKehilangan;
	}

	public void setLaporanKehilangan(boolean laporanKehilangan) {
		LaporanKehilangan = laporanKehilangan;
	}

	public boolean isSudahdiganti() {
		return Sudahdiganti;
	}

	public void setSudahdiganti(boolean sudahdiganti) {
		Sudahdiganti = sudahdiganti;
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

	public boolean isDenda() {
		return Denda;
	}

	public void setDenda(boolean denda) {
		Denda = denda;
	}

	public boolean isSudahDibayar() {
		return SudahDibayar;
	}

	public void setSudahDibayar(boolean sudahDibayar) {
		SudahDibayar = sudahDibayar;
	}

	public ReturnHeader getHeader() {
		return header;
	}

	public void setHeader(ReturnHeader header) {
		this.header = header;
	}

	public Buku getBuku() {
		return buku;
	}

	public void setBuku(Buku buku) {
		this.buku = buku;
	}
	
	

}
