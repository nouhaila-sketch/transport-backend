package com.transport.repository;

import com.transport.model.Horaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoraireRepository extends JpaRepository<Horaire, Long> {
}