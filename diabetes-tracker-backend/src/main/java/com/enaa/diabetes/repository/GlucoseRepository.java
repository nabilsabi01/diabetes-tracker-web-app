package com.enaa.diabetes.repository;


import com.enaa.diabetes.model.Glucose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlucoseRepository extends JpaRepository<Glucose, Long> {
}
