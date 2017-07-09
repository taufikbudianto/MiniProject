package com.arrizaqu.crud.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.arrizaqu.crud.entity.ReturnHeader;

public interface ReturnHeaderDao extends JpaRepository<ReturnHeader, Integer> {
	/*@Modifying(clearAutomatically =true)
	@Query ("update ReturnHeader b set b.SudahDibayar= :SudahDibayar where b.IDAnggota=:IDAnggota")
	int updateHeader(@Param("SudahDibayar") boolean SudahDibayar, @Param("IDAnggota") int IDAnggota);
*/
	
}
