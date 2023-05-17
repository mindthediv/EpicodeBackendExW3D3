package com.w3d3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "location")
public class Location {
    @Id
    @SequenceGenerator(name = "seq_location", sequenceName="seq_location", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_location")
    public long id;
    @Column
    public String nome;
    @Column
    public String citta;
    public Location(String nome, String citta) {
        this.nome = nome;
        this.citta = citta;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCitta() {
        return citta;
    }
    public void setCitta(String citta) {
        this.citta = citta;
    }    
}
