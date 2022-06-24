
package controller;

import abstratas.dao;
import java.util.List;
import model.Locais;

public class daoLocais extends dao<Locais> {
    public List<Locais> read(){
        String JPQL="select l from Locais l order by l.nome";
        return super.read(JPQL);
    }
    public List<Locais> read(String filtro){
        String JPQL="select l from Locais c "
                + "where c.nome like ?1 order by l.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
    
}
