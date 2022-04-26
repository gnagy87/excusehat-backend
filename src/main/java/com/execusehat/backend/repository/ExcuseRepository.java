package com.execusehat.backend.repository;

import com.execusehat.backend.model.entity.ExcuseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExcuseRepository extends JpaRepository<ExcuseEntity, Long> {

//	@Query("select id, name, excuse from ExcuseEntity")
//	List<ExcuseEntity> findAll();

}
