
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
@Table(name="ITINERARIOS")

public class Itinerarios implements java.io.Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id; 
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_destino", nullable = false, referencedColumnName = "id")
    private Destino destino; 
    
    public Itinerarios(){
      
    }
    
    public Itinerarios(int id, Destino destino){
        this.setId(id);
        this.setDestino(destino);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public Destino getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return destino.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
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
        final Itinerarios other = (Itinerarios) obj;
        return this.id == other.id;
    }
    
    
    
    
}