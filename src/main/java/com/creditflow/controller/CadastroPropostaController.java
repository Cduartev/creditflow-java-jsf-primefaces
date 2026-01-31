package com.creditflow.controller;

import com.creditflow.domain.PropostaCredito;
import com.creditflow.service.PropostaService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ViewScoped
public class CadastroPropostaController implements Serializable {

    private final PropostaService service;

    private PropostaCredito proposta;

    public CadastroPropostaController(PropostaService service) {
        this.service = service;
        this.limparFormulario();
    }

    public void salvar() {
        try {
            service.criarNova(proposta);
            addMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Proposta enviada para análise!");
            limparFormulario();
        } catch (Exception e) {
            addMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Falha ao salvar proposta: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void limparFormulario() {
        this.proposta = new PropostaCredito();
    }

    private void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public PropostaCredito getProposta() {
        return proposta;
    }

    public void setProposta(PropostaCredito proposta) {
        this.proposta = proposta;
    }
}