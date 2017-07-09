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

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="T_R_BRW_HEADER")
public class HeaderPinjaman {
	@Id
	@GeneratedValue
	private int Id;
	private String NoRegistrasi;
	private String NoReferensi;
	private Date TanggalPinjam;
	private Date TanggalKembali;
	private Date CreatedOn;
	private int CreatedBy;
	private Date ModifiedOn;
	private int ModifiedBy;
	private boolean Status;
	
	@ManyToOne
	@JoinColumn(name="IDAnggota")
	private Anggota anggota;
	
	@OneToMany (mappedBy="brwheader")
	@JsonIgnore
	private List<BrwDetail>brwDetails;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNoRegistrasi() {
		return NoRegistrasi;
	}

	public void setNoRegistrasi(String noRegistrasi) {
		NoRegistrasi = noRegistrasi;
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

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public Anggota getAnggota() {
		return anggota;
	}

	public void setAnggota(Anggota anggota) {
		this.anggota = anggota;
	}

	@JsonIgnore
	public List<BrwDetail> getBrwDetails() {
		return brwDetails;
	}

	public void setBrwDetails(List<BrwDetail> brwDetails) {
		this.brwDetails = brwDetails;
	}

}
