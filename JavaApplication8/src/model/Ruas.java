
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "RUAS")

public class Ruas implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id; 
    @Column(name ="nome",length = 100,nullable = false)
    private String nome; 
    
    
    
    public Ruas(){   
    }
    
    public Ruas(int id,String nome){
        this.setId(0);
        this.setNome(nome);
        
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "NONAME" : nome.toUpperCase();
    }

    

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    

    @Override
    public String toString() {
        return  this.nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
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
        final Ruas other = (Ruas) obj;
        return this.id == other.id;
    }
    
    
    
    
    
    
    
    
    
    
    
}
