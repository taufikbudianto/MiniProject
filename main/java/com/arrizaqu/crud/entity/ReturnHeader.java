package com.arrizaqu.crud.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Table (name="T_R_RETURN_HEADER")
@Entity
public class ReturnHeader {
	@Id
	@GeneratedValue
	private int ID;
	@Column (nullable=true )
	private String NORegistrasi;
	@Column (nullable=true )
	private String NoReferensi;
	@Column (nullable=true )
	private Date TanggalPinjam;
	@Column (nullable=true )
	private Date TanggalKembali;
	@Column (nullable=true )
	private Date CreatedOn;
	@Column (nullable=true )
	private int CreatedBy;
	@Column (nullable=true )
	private Date ModifiedOn;
	@Column (nullable=true )
	private int ModifiedBy;
	@Column (nullable=true )
	private boolean Denda;
	@Column (nullable=true )
	private boolean SudahDibayar;
	
	@ManyToOne
	@JoinColumn(name="id_Anggota")
	private Anggota anggota;
	
	@OneToMany (mappedBy="header")
	@JsonIgnore
	private List<ReturnDetail> retDetail;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNORegistrasi() {
		return NORegistrasi;
	}

	public void setNORegistrasi(String nORegistrasi) {
		NORegistrasi = nORegistrasi;
	}

	public String getNoReferensi() {
		return NoReferensi;
	}

	public void setNoReferensi(String noReferensi) {
		NoReferensi = noReferensi;
	}

	public Date getTanggalPinjam() {
		return TanggalPinjam;
	}

	public void setTanggalPinjam(Date tanggalPinjam) {
		TanggalPinjam = tanggalPinjam;
	}

	public Date getTanggalKembali() {
		return TanggalKembali;
	}

	public void setTanggalKembali(Date tanggalKembali) {
		TanggalKembali = tanggalKembali;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	public int getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(int createdBy) {
		CreatedBy = createdBy;
	}

	public Date getModifiedOn() {
		return ModifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		ModifiedOn = modifiedOn;
	}

	public int getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public boolean isDenda() {
		return Denda;
	}

	public boolean setDenda(boolean denda) {
		return Denda = denda;
	}

	public boolean isSudahDibayar() {
		return SudahDibayar;
	}

	public boolean setSudahDibayar(boolean sudahDibayar) {
		return SudahDibayar = sudahDibayar;
	}

	public Anggota getAnggota() {
		return anggota;
	}

	public void setAnggota(Anggota anggota) {
		this.anggota = anggota;
	}
	
	@JsonIgnore
	public List<ReturnDetail> getRetDetail() {
		return retDetail;
	}

	public void setRetDetail(List<ReturnDetail> retDetail) {
		this.retDetail = retDetail;
	}
	
	
	

}
