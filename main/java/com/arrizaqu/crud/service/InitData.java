package com.arrizaqu.crud.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arrizaqu.crud.entity.Anggota;
import com.arrizaqu.crud.entity.BrwDetail;
import com.arrizaqu.crud.entity.Buku;
import com.arrizaqu.crud.entity.City;
import com.arrizaqu.crud.entity.Employee;
import com.arrizaqu.crud.entity.HeaderPinjaman;
import com.arrizaqu.crud.entity.ReturnDetail;
import com.arrizaqu.crud.entity.ReturnHeader;
import com.arrizaqu.crud.repository.AnggotaDao;
import com.arrizaqu.crud.repository.BRWDetailDao;
import com.arrizaqu.crud.repository.BukuDao;
import com.arrizaqu.crud.repository.EmployeeDao;
import com.arrizaqu.crud.repository.HeaderPinjamDao;
import com.arrizaqu.crud.repository.ReturnDao;
import com.arrizaqu.crud.repository.cityDAO;

@Service
@Transactional
public class InitData {
	
	@Autowired
	private cityDAO CityDao;
	@Autowired
	private EmployeeDao employeedao;
	
	@Autowired
	private AnggotaDao anggotadao;
	
	@Autowired
	private ReturnDao returndao;
	
	@Autowired
	private BukuDao bukudao;
	
	@Autowired
	private HeaderPinjamDao headerpinjamDao;
	
	@Autowired
	private BRWDetailDao brwDetaildao;
	
	

	
	
/*	@PostConstruct
	public void init(){
		
		City city =new City();
		City city1 =new City();
		City city2 =new City();
		
		city.setCityName("Bandung");
		//city.setId(1);
		city.setNote("Kota aman");
	
		city1.setCityName("jakarta");
		//city1.setId(2);
		city1.setNote("Kota jkt");
		
		city2.setCityName("jogjakarta");
		//city2.setId(3);
		city2.setNote("Kota pelajar");

		
		CityDao.save(city);
		CityDao.save(city1);
		CityDao.save(city2);
		this.insertemployee(city, city2);
	
	
	}
	
	public void insertemployee(City city, City city2){
		
		Employee employee =new Employee();
		employee.setName("aldi");
		employee.setAddress("kebumen");
		employee.setEmail("aldi@gmail.com");
		employee.setCity(city);
	//	employee.setId(1);
		
		Employee employee1 =new Employee();
		employee1.setName("taldi");
		employee1.setAddress("kebumen kota");
		employee1.setEmail("alditambah@gmail.com");
		employee1.setCity(city2);
		//employee1.setId(2);
		
		employeedao.save(employee);
		employeedao.save(employee1);
				
	}*/
	
	/*@PostConstruct
	public void dendaBuku(){
		Anggota anggota= new Anggota();
		Anggota anggota1= new Anggota();
		Anggota anggota2= new Anggota();
		
		anggota.setNama("Taufik Agus Budiyanto");
		anggota.setKodeAnggota("AA1234556");
		anggota.setAlamat("Kebumen");
		
		
		anggota1.setNama("Jhonniko");
		anggota1.setKodeAnggota("DQ121434");
		anggota1.setAlamat("Bandung");
		
		anggota2.setNama("Agung swandaru Guntoro");
		anggota2.setKodeAnggota("AAC123254363");
		anggota2.setAlamat("Purworjo");
		
		anggotadao.save(anggota);
		anggotadao.save(anggota1);
		anggotadao.save(anggota2);
		
		this.insertHeader(anggota, anggota1, anggota2);
	}
	
	public void insertHeader(Anggota anggota,Anggota anggota1, Anggota anggota2){
		HeaderPinjaman headerPinjam1=new HeaderPinjaman();
		HeaderPinjaman headerPinjam2=new HeaderPinjaman();
		HeaderPinjaman headerPinjam3=new HeaderPinjaman();

		headerPinjam1.setNoRegistrasi("BRW2016050003");
		headerPinjam1.setAnggota(anggota);
		
		headerPinjam2.setNoRegistrasi("BRW2016050004");
		headerPinjam2.setAnggota(anggota1);
		
		headerPinjam3.setNoRegistrasi("BRW2016050005");
		headerPinjam3.setAnggota(anggota2);
		
		headerpinjamDao.save(headerPinjam1);
		headerpinjamDao.save(headerPinjam2);
		headerpinjamDao.save(headerPinjam3);
		
		this.insertid(headerPinjam1,headerPinjam2,headerPinjam3);
		
		
	}
	
	private void insertid(HeaderPinjaman headerPinjam1,HeaderPinjaman headerPinjam2,HeaderPinjaman headerPinjam3) {
		
				BrwDetail brwdetail=new BrwDetail();
				BrwDetail brwdetail1=new BrwDetail();
				BrwDetail brwdetail2=new BrwDetail();
				BrwDetail brwdetail3=new BrwDetail();
				BrwDetail brwdetail4=new BrwDetail();
				BrwDetail brwdetail5=new BrwDetail();
				BrwDetail brwdetail6=new BrwDetail();
				BrwDetail brwdetail7=new BrwDetail();
				BrwDetail brwdetail8=new BrwDetail();
				BrwDetail brwdetail9=new BrwDetail();
				BrwDetail brwdetail10=new BrwDetail();
				
				brwdetail.setBrwheader(headerPinjam1);
				brwdetail.setModifiedBy(0);
				
				brwdetail1.setBrwheader(headerPinjam1);
				brwdetail1.setModifiedBy(0);
				
				brwdetail2.setBrwheader(headerPinjam1);
				brwdetail2.setModifiedBy(0);
				
				brwdetail3.setBrwheader(headerPinjam2);
				brwdetail3.setModifiedBy(0);
				
				brwdetail4.setBrwheader(headerPinjam2);
				brwdetail4.setModifiedBy(0);
				
				brwdetail5.setBrwheader(headerPinjam3);
				brwdetail5.setModifiedBy(0);
				
				brwdetail6.setBrwheader(headerPinjam3);
				brwdetail6.setModifiedBy(0);
				
				brwdetail7.setBrwheader(headerPinjam3);
				brwdetail7.setModifiedBy(0);
				
				brwdetail8.setBrwheader(headerPinjam1);
				brwdetail8.setModifiedBy(0);
				
				brwdetail9.setBrwheader(headerPinjam2);
				brwdetail9.setModifiedBy(0);
				
				brwdetail10.setBrwheader(headerPinjam3);
				brwdetail10.setModifiedBy(0);
				
				brwDetaildao.save(brwdetail);
				brwDetaildao.save(brwdetail1);
				brwDetaildao.save(brwdetail2);
				brwDetaildao.save(brwdetail3);
				brwDetaildao.save(brwdetail4);
				brwDetaildao.save(brwdetail5);
				brwDetaildao.save(brwdetail6);
				brwDetaildao.save(brwdetail7);
				brwDetaildao.save(brwdetail8);
				brwDetaildao.save(brwdetail9);
				brwDetaildao.save(brwdetail10);
	}*/
	
	/*
	public void insertHeader(Anggota anggota,Anggota anggota1, Anggota anggota2){
		
		ReturnHeader ReturnHeader0= new ReturnHeader();
		ReturnHeader ReturnHeader1= new ReturnHeader();
		ReturnHeader ReturnHeader2= new ReturnHeader();
		
		ReturnHeader0.setNORegistrasi("RTR2016050001");
		ReturnHeader0.setDenda(false);
		ReturnHeader0.setSudahDibayar(false);
		ReturnHeader0.setAnggota(anggota);
		
		ReturnHeader1.setNORegistrasi("RTR2016050002");
		ReturnHeader1.setDenda(false);
		ReturnHeader1.setSudahDibayar(false);
		ReturnHeader1.setAnggota(anggota1);
		
		ReturnHeader2.setNORegistrasi("RTR2016050001");
		ReturnHeader2.setDenda(false);
		ReturnHeader2.setSudahDibayar(false);
		ReturnHeader2.setAnggota(anggota2);

		returndao.save(ReturnHeader0);
		returndao.save(ReturnHeader1);
		returndao.save(ReturnHeader2);
		
		
		this.insertid(ReturnHeader0, ReturnHeader1, ReturnHeader2);
	}
	
		private void insertid(ReturnHeader ReturnHeader0, ReturnHeader ReturnHeader1, ReturnHeader ReturnHeader2) {
		// TODO Auto-generated method stub
			ReturnDetail returndetail =new ReturnDetail();
			ReturnDetail returndetail1 =new ReturnDetail();
			ReturnDetail returndetail2 =new ReturnDetail();
			ReturnDetail returndetail3 =new ReturnDetail();
			
			returndetail.setHeaderRTR(ReturnHeader0);
			returndetail.setSudahDibayar(false);
			returndetail.setDenda(false);
			
			returndetail1.setHeaderRTR(ReturnHeader1);
			returndetail1.setSudahDibayar(false);
			returndetail1.setDenda(false);
			
			returndetail2.setHeaderRTR(ReturnHeader2);
			returndetail2.setSudahDibayar(false);
			returndetail2.setDenda(false);
			
			returndetail3.setHeaderRTR(ReturnHeader1);
			returndetail3.setSudahDibayar(false);
			returndetail3.setDenda(false);
			
			returndetaialdao.save(returndetail);
			returndetaialdao.save(returndetail1);
			returndetaialdao.save(returndetail2);
			returndetaialdao.save(returndetail3);
		
	}
		@PostConstruct
		public void inserbuku(){
		
			Buku buku=new Buku();
			Buku buku1=new Buku();
			Buku buku2=new Buku();
			Buku buku3=new Buku();
			Buku buku4=new Buku();
			
			buku.setKode("200074723");
			buku.setJudulBuku("Introducing Autocad Civil");
		
			buku1.setKode("202549008");
			buku1.setJudulBuku("Dasar Dasar Pemrograman Database Desktop Dengan Visual Basic");
		
			buku2.setKode("202549009");
			buku2.setJudulBuku("Dasar Dasar Pemrograman Database Desktop Dengan Visual Basic");
		
			buku3.setKode("202549010");
			buku3.setJudulBuku("Dasar Dasar Pemrograman Database Desktop Dengan Visual Basic");
		
			buku4.setKode("201078008");
			buku4.setJudulBuku("Analisa dan perancangan fondasi 1 Ed.2");
		
			bukudao.save(buku);
			bukudao.save(buku1);
			bukudao.save(buku2);
			bukudao.save(buku3);		
			bukudao.save(buku4);
			
//			this.inserdetail(buku,buku1,buku2,buku3,buku4);
			
	}*/
	
/*		public void inserdetail(Buku buku, Buku buku1, Buku buku2, Buku buku3, Buku buku4){
			
			
			ReturnDetail returndetail =new ReturnDetail();
			ReturnDetail returndetail1 =new ReturnDetail();
			ReturnDetail returndetail2 =new ReturnDetail();
			ReturnDetail returndetail3 =new ReturnDetail();
			
			returndetail.setBuku(buku);
			
			returndetail1.setBuku(buku);
			
			returndetail2.setBuku(buku);
			
			returndetail3.setBuku(buku);
			
			
			returndetaialdao.save(returndetail);
			returndetaialdao.save(returndetail1);
			returndetaialdao.save(returndetail2);
			returndetaialdao.save(returndetail3);
			
		}
*/
}
