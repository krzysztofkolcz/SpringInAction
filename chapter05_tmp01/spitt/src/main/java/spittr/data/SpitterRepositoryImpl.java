package spittr.data;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import spittr.model.Spittle;
import spittr.model.Spitter;
import spittr.dao.SpitterDao;

@Service("spitterRepository")
@Transactional
public class SpitterRepositoryImpl implements SpitterRepository {
    @Autowired
    private SpitterDao spitterDao;

    @Override
    public Spitter save(Spitter spitter){
        spitterDao.saveSpitter(spitter);
        return spitter;
    }
    @Override
    public Spitter findByUsername(String username){
        Spitter spitter = spitterDao.findSpitterByUsername(username);
        return spitter;
    }
}
