package com.senai.backend.controle_frequencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="entrada")
    private LocalDate dataNascimento;

    @Column(name="saida")
    private LocalDate dataNascimento;

     @Column(name="registro")
    private LocalDate dataNascimento;

     @Column(name="usuario")
    private LocalDate dataNascimento;

     @Column(name="data")
    private LocalDate dataNascimento;

      public Integer id() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }
      public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }
      public String entrada() {
        return entrada;
    }

    public void setentrada(String entrada) {
        this.entrada = entrada;
    }
      public String getsaida() {
        return saida;
    }

    public void setsaida(String saida) {
        this.saida = saida;
    }
    
      public String registro() {
        return registro;
    }

    public void setregistro(String registro) {
        this.registro = registro;
    }
      public String getusuario() {
        return usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
      public LocalDate getdata() {
        return data;
    }

    public void setdata(LocalDate data) {
        this.data = data;
    }
}
