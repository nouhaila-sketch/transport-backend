package com.transport.repository;

import com.transport.model.Ligne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneRepository extends JpaRepository<Ligne, Long> {
}