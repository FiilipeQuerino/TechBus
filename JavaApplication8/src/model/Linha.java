
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
@Table(name = "LINHA")
public class Linha implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;
    
    @Column(name = "horario_seg_sext",length = 5, nullable = false)
    private String horario_seg_sext;
    
    @Column(name = "horario_sab",length = 5, nullable = false)
    private String horario_sab;
    
    @Column(name = "horario_dom",length = 5, nullable = false)
    private String horario_dom;
    
    @Column(name = "descricaoLinha",length = 5, nullable = false)
    private String descricaoLinha;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_onibus",nullable = false, referencedColumnName = "id")
    private Onibus onibus;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_itinerario",nullable = false, referencedColumnName = "id")
    private Itinerarios itinerarios;

    public Linha() {
    }

    public Linha(int id, String horario_seg_sext, String horario_sab, String horario_dom, String descricaoLinha, Onibus onibus, Itinerarios itinerarios) {
        this.setId(id);
        this.setHorario_seg_sext(horario_seg_sext);
        this.setHorario_sab (horario_sab);
        this.setHorario_dom (horario_dom);
        this.setDescricaoLinha (descricaoLinha);
        this.setOnibus (onibus);
        this.setItinerarios (itinerarios);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHorario_seg_sext(String horario_seg_sext) {
        this.horario_seg_sext = horario_seg_sext.trim().isEmpty()?"00:00":horario_seg_sext.toUpperCase();
    }

    public void setHorario_sab(String horario_sab) {
        this.horario_sab = horario_sab.trim().isEmpty()?"00:00":horario_sab.toUpperCase();
    }

    public void setHorario_dom(String horario_dom) {
        this.horario_dom = horario_dom.trim().isEmpty()?"00:00":horario_dom.toUpperCase();
    }

    public void setDescricaoLinha(String descricaoLinha) {
        this.descricaoLinha = descricaoLinha.trim().isEmpty()?"SEMDESCRIÇÃO":descricaoLinha.toUpperCase();
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public void setItinerarios(Itinerarios itinerarios) {
        this.itinerarios = itinerarios;
    }

    //
    public int getId() {
        return id;
    }

    public String getHorario_seg_sext() {
        return this.horario_seg_sext;
    }

    public String getHorario_sab() {
        return this.horario_sab;
    }

    public String getHorario_dom() {
        return this.horario_dom;
    }

    public String getDescricaoLinha() {
        return this.descricaoLinha;
    }

    public Onibus getOnibus() {
        return this.onibus;
    }

    public Itinerarios getItinerarios() {
        return this.itinerarios;
    }
    
    @Override
    public String toString(){
        return this.descricaoLinha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
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
        final Linha other = (Linha) obj;
        return this.id == other.id;
    }
    
    
    
}
