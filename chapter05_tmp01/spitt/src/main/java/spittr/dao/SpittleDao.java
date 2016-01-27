package spittr.dao;
import java.util.List;
import spittr.model.Spittle;
 
public interface SpittleDao{
    public void saveSpittle(Spittle spittle);
    public List<Spittle> findAllSpittles();
    public void deleteSpittleById(Long id);
    public Spittle findById(Long id);
}
