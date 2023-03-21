package com.demo.repository;

import com.demo.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository <NewEntity, Long> {
}
