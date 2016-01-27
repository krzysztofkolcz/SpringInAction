package spittr.dao;
import java.util.List;
import spittr.model.Spittle;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
 
@Repository("spittleDao")
public class SpittleDaoImpl extends AbstractDao<Long,Spittle> implements SpittleDao {

    public void saveSpittle(Spittle spittle){
        persist(spittle);
    }
    
    public List<Spittle> findAllSpittles(){
      Criteria criteria = createEntityCriteria();
      return (List<Spittle>) criteria.list();
    }

    public void deleteSpittleById(Long id){
      Query query = getSession().createSQLQuery("delete from Spittles where id = :id");
      query.setLong("id",id);
      query.executeUpdate();
    }

    public Spittle findById(Long id){
      return getByKey(id);
    }
}
