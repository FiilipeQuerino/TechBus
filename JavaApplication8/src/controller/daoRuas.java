
package controller;

import abstratas.dao;
import java.util.List;
import model.Ruas;

public class daoRuas extends dao<Ruas> {
    public List<Ruas> read(){
        String JPQL="select r from Ruas r order by r.nome";
        return super.read(JPQL);
    }
    public List<Ruas> read(String filtro){
        String JPQL="select r from Ruas r where r.nome like ?1 order by r.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
    
}
