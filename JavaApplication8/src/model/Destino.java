
package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import jdk.jfr.Label;


@Entity
@Table(name="DESTINO")
public class Destino implements java.io.Serializable{
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id; 
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_local_saida", nullable = false,referencedColumnName = "id")
    private Locais local_saida;
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_local_chegada" , nullable = false, referencedColumnName = "id")
    private Locais local_chegada;
    
    public Destino(){
        
    }

    public Destino(int id, Locais local_saida, Locais local_chegada) {
        this.setId(id);
        this.setLocal_saida(local_saida);
        this.setLocal_chegada(local_chegada);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocal_saida(Locais local_saida) {
        this.local_saida = local_saida;
    }

    public void setLocal_chegada(Locais local_chegada) {
        this.local_chegada = local_chegada;
    }

    public int getId() {
        return this.id;
    }

    public Locais getLocal_saida() {
        return this.local_saida;
    }

    public Locais getLocal_chegada() {
        return this.local_chegada;
    }

    @Override
    public String toString() {
        return local_saida +" - "+local_chegada;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final Destino other = (Destino) obj;
        return this.id == other.id;
    }
   
    
}
