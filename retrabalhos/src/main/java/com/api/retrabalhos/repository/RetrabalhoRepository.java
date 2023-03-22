package com.api.retrabalhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.retrabalhos.entity.RetrabalhoEntity;

@Repository
public interface RetrabalhoRepository extends JpaRepository<RetrabalhoEntity, Long>{

}
