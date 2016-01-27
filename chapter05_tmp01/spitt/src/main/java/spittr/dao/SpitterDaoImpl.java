package spittr.dao;
import java.util.List;
import spittr.model.Spitter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
@Repository("spitterDao")
public class SpitterDaoImpl extends AbstractDao<Integer,Spitter> implements SpitterDao {

    public void saveSpitter(Spitter spitter){
        persist(spitter);
    }
    
    public List<Spitter> findAllSpitters(){
      Criteria criteria = createEntityCriteria();
      return (List<Spitter>) criteria.list();
    }

    public void deleteSpitterByUsername(String username){
      Query query = getSession().createSQLQuery("delete from Spitters where username = :username");
      query.setString("username",username);
      query.executeUpdate();
    }

    public Spitter findById(int id){
      return getByKey(id);
    }

    public Spitter findSpitterByUsername(String username){
      Criteria criteria = createEntityCriteria();
      criteria.add(Restrictions.eq("username",username));
      return (Spitter) criteria.uniqueResult();
    }
}
