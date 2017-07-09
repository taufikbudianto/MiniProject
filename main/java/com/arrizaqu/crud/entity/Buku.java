package com.arrizaqu.crud.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table (name="T_MST_Buku")
public class Buku {
	@Id
	@GeneratedValue
	private int ID;
	@Column(name="IDKategori", nullable=false)
	private int IDKategori;
	@Column(name="IDPenerbit", nullable=false)
	private int IDPenerbit;
	@Column(name="Kode", nullable=true, length=50)
	private String Kode;
	@Column(name="JudulBuku", nullable=true, length=255)
	private String JudulBuku;
	@Column(name="ISBN", nullable=true, length=50)
	private String ISBN;
	@Column(name="Pengarang", nullable=true, length=50)
	private String Pengarang;
	@Column(name="Lokasi", nullable=true)
	private int Lokasi;
	@Column(name="Aktif", nullable=true)
	private boolean Aktif;
	@Column(name="Value", nullable=true)
	private int Value;
	@Column(name="IDSumberBuku", nullable=true)
	private int IDSumberBuku;
	
	@OneToMany (mappedBy="buku")
	@JsonIgnore
	private List<ReturnDetail> retDetail;
	
	@OneToMany (mappedBy="buku")
	@JsonBackReference 
	private List<BrwDetail>details;
	

	public List<BrwDetail> getDetails() {
		return details;
	}

	public void setDetails(List<BrwDetail> details) {
		this.details = details;
	}

	/*
	@JsonIgnore
	private List<HeaderPinjaman> headerPinjaman;
	
	@JsonIgnore
	public List<HeaderPinjaman> getHeaderPinjaman() {
		return headerPinjaman;
	}

	public void setHeaderPinjaman(List<HeaderPinjaman> headerPinjaman) {
		this.headerPinjaman = headerPinjaman;
	}
*/
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getIDKategori() {
		return IDKategori;
	}

	public void setIDKategori(int iDKategori) {
		IDKategori = iDKategori;
	}

	public int getIDPenerbit() {
		return IDPenerbit;
	}

	public void setIDPenerbit(int iDPenerbit) {
		IDPenerbit = iDPenerbit;
	}

	public String getKode() {
		return Kode;
	}

	public void setKode(String kode) {
		Kode = kode;
	}

	public String getJudulBuku() {
		return JudulBuku;
	}

	public void setJudulBuku(String judulBuku) {
		JudulBuku = judulBuku;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getPengarang() {
		return Pengarang;
	}

	public void setPengarang(String pengarang) {
		Pengarang = pengarang;
	}

	public int getLokasi() {
		return Lokasi;
	}

	public void setLokasi(int lokasi) {
		Lokasi = lokasi;
	}

	public boolean isAktif() {
		return Aktif;
	}

	public void setAktif(boolean aktif) {
		Aktif = aktif;
	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}

	public int getIDSumberBuku() {
		return IDSumberBuku;
	}

	public void setIDSumberBuku(int iDSumberBuku) {
		IDSumberBuku = iDSumberBuku;
	}

	@JsonIgnore
	public List<ReturnDetail> getRetDetail() {
		return retDetail;
	}

	public void setRetDetail(List<ReturnDetail> retDetail) {
		this.retDetail = retDetail;
	}
	
	
}
