
package controller;

import abstratas.dao;
import java.util.List;
import model.Destino;


public class daoDestino extends dao<Destino>{
    public List<Destino> readDestinoSaida(){
        String JPQL="select d from Destino d order by d.local_saida";
        return super.read(JPQL);
    }
    public List<Destino> readDestinoChegada(){
        String JPQL="select d from Destino d order by d.local_chegada";
        return super.read(JPQL);
    }
}
