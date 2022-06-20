package com.execusehat.backend.repository;

import com.execusehat.backend.model.entity.ExcuseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExcuseRepository extends JpaRepository<ExcuseEntity, Long> {

}
