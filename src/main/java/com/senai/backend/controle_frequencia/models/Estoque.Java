package com.senai.backend.controle_frequencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="validade")
    private LocalDate validade;

    @Column(name="quantidade")
    private String quantidade;

     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getvalidade() {
        return validade;
    }

    public void setvalidade(String validade) {
        this.validade = validade;
    }

    public String getquantidade() {
        return quantidade;
    }

    public void setquantidade(String quantidade) {
        this.quantidade = quantidade;
    }

}
