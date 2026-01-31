package com.creditflow.service;

import com.creditflow.domain.PropostaCredito;
import com.creditflow.domain.StatusProposta;
import com.creditflow.repository.PropostaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PropostaService {

    private final PropostaRepository repository;

    public PropostaService(PropostaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public PropostaCredito criarNova(PropostaCredito proposta) {
        if (proposta.getValorSolicitado().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor solicitado deve ser maior que zero.");
        }

        proposta.setStatus(StatusProposta.EM_ANALISE);

        return repository.save(proposta);
    }

    public List<PropostaCredito> listarTodas() {
        return repository.findAll();
    }
}