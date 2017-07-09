package com.arrizaqu.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_iuran")
public class Iuran {
	@Id
	@GeneratedValue
	private int Id;
	@Column(name="Tipe_Iuran")
	private String Tipe_iuran;
	@Column(name="Jumlah")
	private Double jumlah;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTipe_iuran() {
		return Tipe_iuran;
	}
	public void setTipe_iuran(String tipe_iuran) {
		Tipe_iuran = tipe_iuran;
	}
	public Double getJumlah() {
		return jumlah;
	}
	public void setJumlah(Double jumlah) {
		this.jumlah = jumlah;
	}
	
	

}
