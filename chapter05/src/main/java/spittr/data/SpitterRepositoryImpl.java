package spittr.data;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import spittr.Spittle;
import spittr.Spitter;

@Repository
public class SpitterRepositoryImpl implements SpitterRepository {

    @Override
    public Spitter save(Spitter spitter){
        Spitter saved = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
        return saved;
    }
    @Override
    public Spitter findByUsername(String username){
        Spitter spitter = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
        return spitter;
    }
}
