
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ONIBUS")
public class Onibus implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;
    
    @Column(name = "modelo",length = 100, nullable = false)
    private String modelo;
    
    @Column(name = "placa",length = 8, nullable = false)
    private String placa;

    public Onibus() {
    }

    public Onibus(int id, String modelo, String placa) {
        this.setId(id);
        this.setModelo(modelo);
        this.setPlaca(placa);
    }
    //

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.trim().isEmpty()?"MODELO":modelo.toUpperCase();
    }

    public void setPlaca(String placa) {
        this.placa = placa.trim().isEmpty()?"SEM-0000":placa.toUpperCase();
    }
    
    //

    public int getId() {
        return this.id;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }
    
    @Override
    public String toString(){
        return this.modelo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
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
        final Onibus other = (Onibus) obj;
        return this.id == other.id;
    }
    
}
