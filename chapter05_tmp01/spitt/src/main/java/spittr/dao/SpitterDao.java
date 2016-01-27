package spittr.dao;
import java.util.List;
import spittr.model.Spitter;
 
public interface SpitterDao{
    public void saveSpitter(Spitter spitter);
    public List<Spitter> findAllSpitters();
    public void deleteSpitterByUsername(String username);
    public Spitter findById(int id);
    public Spitter findSpitterByUsername(String username);
}
