package com.arrizaqu.crud.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class City {
	@Id
	@GeneratedValue
	private int Id;
	@Column(nullable=false)
	private String CityName;
	private String Note;
	@OneToMany(mappedBy="city")
	private List<Employee> employees;// for each untuk menampilkan data 
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	

}
