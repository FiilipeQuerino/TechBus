
package controller;

import abstratas.dao;
import java.util.List;
import model.Linha;


public class daoLinha extends dao<Linha> {
    public List<Linha> read(){
        String JPQL="select l from Linha l order by l.descricaoLinha";
        return super.read(JPQL);
    }

    public List<Linha> readDescricao(String filtroDescricao){        
        String JPQL="select l from Linha l where l.descricaoLinha like ?1 order by l.descricaoLinha";
        return super.read(JPQL,"%"+filtroDescricao.toUpperCase()+"%");
    }  
    public List<Linha> readHorarioSegSexta(String filtroHorarioSegSexta){        
        String JPQL="select l from Linha l where l.descricaoLinha like ?1 order by l.descricaoLinha";
        return super.read(JPQL,"%"+filtroHorarioSegSexta.toUpperCase()+"%");
    }  
    public List<Linha> readHorarioSab(String filtroHorarioSab){        
        String JPQL="select l from Linha l where l.descricaoLinha like ?1 order by l.descricaoLinha";
        return super.read(JPQL,"%"+filtroHorarioSab.toUpperCase()+"%");
    }  
    public List<Linha> readHorarioDom(String filtroHorarioDom){        
        String JPQL="select l from Linha l where l.descricaoLinha like ?1 order by l.descricaoLinha";
        return super.read(JPQL,"%"+filtroHorarioDom.toUpperCase()+"%");
    }  
}
