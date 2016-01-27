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
import spittr.dao.SpittleDao;

@Service("SpittleRepository")
@Transactional
public class SpittleRepositoryImpl implements SpittleRepository {

    @Autowired 
    private SpittleDao spittleDao;

    @Override
    public List<Spittle> findSpittles(long max, int count){
        return spittleDao.findAllSpittles();
    }

    public Spittle findOne(long spittleId){
        return spittleDao.findById(spittleId);
    }
}
