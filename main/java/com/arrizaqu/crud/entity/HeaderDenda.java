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

@Entity
@Table(name="T_R_DENDAHEADER")
public class HeaderDenda {
	@Id
	@GeneratedValue
	private Integer ID;
	@Column(name="NoRegistrasi", nullable=true, length=20)
	private String NoRegistrasi;
	@Column(name="NoReferensi",length=20, nullable=true)
	private String NoReferensi;
	@Column(name="CreatedBy", nullable=true)
		private Integer CreatedBy;
	@Column(name="Denda", nullable=true)
	private boolean Denda;
	public boolean isDenda() {
		return Denda;
	}

	public void setDenda(boolean denda) {
		Denda = denda;
	}

	@Column(name="CreatedOn", nullable=true)
	private Date CreatedOn;
	@Column(name="ModfiedOn", nullable=true)
	private Date ModifiedOn;
	@Column(name="ModifiedBy", nullable=true)
	private Integer ModifiedBy; 

	
	
	@OneToMany (mappedBy="header")
	private List<DeataiDenda> details;
	
	@ManyToOne
	@JoinColumn(name="id_Anggota")
	private Anggota anggota;

	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
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

	public Integer getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(Integer createdBy) {
		CreatedBy = createdBy;
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

	public Integer getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public List<DeataiDenda> getDetails() {
		return details;
	}

	public void setDetails(List<DeataiDenda> details) {
		this.details = details;
	}

	public Anggota getAnggota() {
		return anggota;
	}

	public void setAnggota(Anggota anggota) {
		this.anggota = anggota;
	}

	
}
