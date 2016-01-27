package spittr.data;
import java.util.List;
import spittr.model.Spitter;

public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
