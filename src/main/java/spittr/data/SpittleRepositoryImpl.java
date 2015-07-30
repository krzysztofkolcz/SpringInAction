package spittr.data;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import spittr.Spittle;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count){
        return createSpittleList(count);
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date(),12.513,13.353));
        }
        return spittles;
    }

    public Spittle findOne(long spittleId){
        return new Spittle("Spittle ", new Date(),12.124,14.35423);
    }
}
