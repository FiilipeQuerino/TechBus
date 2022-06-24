
package controller;

import abstratas.dao;
import java.util.List;
import model.Itinerarios;

public class daoItinerarios extends dao<Itinerarios> {
    public List<Itinerarios> read(){
        String JPQL="select i from Itinerario i order by i.destino";
        return super.read(JPQL);
    }
    
}
