
package abstratas;

import java.util.List;
import javax.persistence.Query;

abstract public class dao<T> {
    public void create(T object){
        Dados.getManager().getTransaction().begin();
        Dados.getManager().persist(object);
        Dados.getManager().getTransaction().commit();
    }
    public void update(T object){
        Dados.getManager().getTransaction().begin();
        Dados.getManager().merge(object);
        Dados.getManager().getTransaction().commit();
    }
    public void delete(T object){
        Dados.getManager().getTransaction().begin();
        Dados.getManager().remove(object);
        Dados.getManager().getTransaction().commit();
    }
    public T read(Class<T> classtoReturn, int id){
        return (Dados.getManager().find(classtoReturn, id));
    }
    //
    public List<T> read(String jpql){
        Query query = Dados.getManager().createQuery(jpql);
        return query.getResultList();
    }
    
    public List<T> read(String JPQL,Object... args){        
        Query query = Dados.getManager().createQuery(JPQL);
        for(int i=0;i<args.length;i++){
            query.setParameter((i+1), args[i]);
        }
        return query.getResultList();                
    }
    
    
}
