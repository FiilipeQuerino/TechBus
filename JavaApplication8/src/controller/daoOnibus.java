
package controller;

import abstratas.dao;
import java.util.List;
import model.Onibus;

public class daoOnibus extends dao<Onibus> {
    public List<Onibus> read(){
        String JPQL="select o from Onibus o order by o.modelo";
        return super.read(JPQL);
    }

    public List<Onibus> readModelo(String filtroModelo){        
        String JPQL="select o from Onibus o where o.modelo like ?1 order by o.modelo";
        return super.read(JPQL,"%"+filtroModelo.toUpperCase()+"%");
    }  
    
    public List<Onibus> readPlaca(String filtroPlaca){        
        String JPQL="select o from Onibus o where o.placa like ?1 order by o.placa";
        return super.read(JPQL,"%"+filtroPlaca.toUpperCase()+"%");
    }
}
