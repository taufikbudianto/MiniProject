package com.arrizaqu.crud.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Table (name="T_MST_ANGGOTA")
@Entity
public class Anggota {
	@Id
	@GeneratedValue
	private int ID;
	@Column (length=20,nullable=false )
	private String KodeAnggota;
	@Column (length=50,nullable=false )
	private String Nama;
	@Column (length=255,nullable=false )
	private String Alamat;
	@Column (nullable=true )
	private int IDProvinsi;
	@Column (nullable=true )
	private int IDKota;
	@Column (nullable=true )
	private int IDKecamatan;
	@Column (nullable=true )
	private String Email;
	@Column (nullable=true )
	private String NoTelepon;
	@Column (nullable=true )
	private Date MasaBerlakukartu;
	@Column (nullable=true )
	private Date MasaBerlakuAnggota;
	@Column (nullable=true )
	private Date CreatedOn;
	@Column (nullable=true )
	private int CretedBy;
	@Column (nullable=true )
	private Date ModifiedOn;
	@Column (nullable=true )
	private int ModifiedBy;
	
	@OneToMany (mappedBy="anggota")
	@JsonIgnore
	private List<ReturnHeader> retheader;
	
	@OneToMany (mappedBy="anggota")
	@JsonIgnore
	private List<HeaderPinjaman> headPinjaman;
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getKodeAnggota() {
		return KodeAnggota;
	}

	public void setKodeAnggota(String kodeAnggota) {
		KodeAnggota = kodeAnggota;
	}

	public String getNama() {
		return Nama;
	}

	public void setNama(String nama) {
		Nama = nama;
	}

	public String getAlamat() {
		return Alamat;
	}

	public void setAlamat(String alamat) {
		Alamat = alamat;
	}

	public int getIDProvinsi() {
		return IDProvinsi;
	}

	public void setIDProvinsi(int iDProvinsi) {
		IDProvinsi = iDProvinsi;
	}

	public int getIDKota() {
		return IDKota;
	}

	public void setIDKota(int iDKota) {
		IDKota = iDKota;
	}

	public int getIDKecamatan() {
		return IDKecamatan;
	}

	public void setIDKecamatan(int iDKecamatan) {
		IDKecamatan = iDKecamatan;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNoTelepon() {
		return NoTelepon;
	}

	public void setNoTelepon(String noTelepon) {
		NoTelepon = noTelepon;
	}

	public Date getMasaBerlakukartu() {
		return MasaBerlakukartu;
	}

	public void setMasaBerlakukartu(Date masaBerlakukartu) {
		MasaBerlakukartu = masaBerlakukartu;
	}

	public Date getMasaBerlakuAnggota() {
		return MasaBerlakuAnggota;
	}

	public void setMasaBerlakuAnggota(Date masaBerlakuAnggota) {
		MasaBerlakuAnggota = masaBerlakuAnggota;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}

	public int getCretedBy() {
		return CretedBy;
	}

	public void setCretedBy(int cretedBy) {
		CretedBy = cretedBy;
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
	@JsonIgnore
	public List<ReturnHeader> getRetheader() {
		return retheader;
	}

	public void setRetheader(List<ReturnHeader> retheader) {
		this.retheader = retheader;
	}
	
	
	

}
