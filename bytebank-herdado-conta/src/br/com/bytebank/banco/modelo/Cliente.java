package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
* Classe que representa um cliente no Bytebank.
*
*@author Aline
*@version 0.1
*/
public class Cliente { 
    private String nome; 
    private String cpf; 
    private String profissao; 

    public String getNome() {
        return nome;
    }

    public String getCpf() { 
        return cpf;
    }

    public String getProfissao() { 
        return profissao; 
    }

    public void setProfissao(String profissao) { 
        this.profissao = profissao;
    }

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	} 
} 
