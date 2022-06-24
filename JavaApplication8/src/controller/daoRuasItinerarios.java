
package controller;

import abstratas.dao;
import java.util.List;
import model.Ruas_Itinerarios;

public class daoRuasItinerarios extends dao<Ruas_Itinerarios> {
    public List<Ruas_Itinerarios> read(){
        String JPQL="select ri from Ruas_Itinerarios ri order by ri.qtdPontos";
        return super.read(JPQL);
    }
    public List<Ruas_Itinerarios> read(String filtro){
        String JPQL="select ri from Ruas_Itinerarios ri where ri.qtdPontos like ?1 order by ri.qtdPontos";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
    
}
