package com.w3d3;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

enum tipoEvento {PUBBLICO,PRIVATO};


@Entity
@Table (name = "eventi")
public class Evento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int id;
    @Column
	public String titolo;
    @Column(name = "data_evento")
	public String dataEvento;
    @Column
	public String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
	public tipoEvento tipoEvento;
    @Column(name = "n_max_partecipanti")
	public int numeroMassimoPartecipanti;
    @OneToMany(mappedBy = "evento")
    public Set<Partecipazione> partecipazioni;
    @OneToOne
    public Location location;
    
    public Evento(String titolo, String dataEvento, String descrizione, com.w3d3.tipoEvento tipoEvento,
            int numeroMassimoPartecipanti, Location location) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public tipoEvento getTipoEvento() {
        return tipoEvento;
    }
    public void setTipoEvento(tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }
    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
}
