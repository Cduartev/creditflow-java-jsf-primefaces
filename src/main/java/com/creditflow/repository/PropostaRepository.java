package com.creditflow.repository;

import com.creditflow.domain.PropostaCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepository extends JpaRepository<PropostaCredito, Long> {
}