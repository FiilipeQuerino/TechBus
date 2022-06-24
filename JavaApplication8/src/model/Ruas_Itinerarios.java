
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="RUAS_ITINERARIOS")

public class Ruas_Itinerarios implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;
    @Column(name = "qtd_pontos",length = 100,nullable = false)
    private int qtdPontos; 
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name= "id_itinerario",nullable = false,referencedColumnName = "id")
    private Itinerarios itinerarios; 
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ruas",nullable = false,referencedColumnName = "id")
    private Ruas ruas; 

    public Ruas_Itinerarios() {
    }
    
    public Ruas_Itinerarios(int id, int qtdPontos, Itinerarios itinerarios, Ruas ruas){
        this.setId(id); 
        this.setQtdPontos(qtdPontos);
        this.setItinerarios(itinerarios);
        this.setRuas(ruas);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtdPontos(int qtdPontos) {
        this.qtdPontos = qtdPontos <= 0 ? 1 : qtdPontos;
    }

    public void setItinerarios(Itinerarios itinerarios) {
        this.itinerarios = itinerarios;
    }

    public void setRuas(Ruas ruas) {
        this.ruas = ruas;
    }

    public int getId() {
        return this.id;
    }

    public int getQtdPontos() {
        return this.qtdPontos;
    }

    public Itinerarios getItinerarios() {
        return this.itinerarios;
    }

    public Ruas getRuas() {
        return this.ruas;
    }

    @Override
    public String toString() {
        return this.qtdPontos+"";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ruas_Itinerarios other = (Ruas_Itinerarios) obj;
        return this.id == other.id;
    }
  
    
}