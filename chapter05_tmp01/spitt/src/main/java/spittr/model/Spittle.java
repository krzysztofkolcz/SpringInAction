package spittr.model;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Entity
@Table(name="Spittle")
public class Spittle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column(name = "message", nullable = true)
    private final String message;

    @NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy") 
    @Column(name = "message_time", nullable = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private final Date time;

    private Double latitude;
    private Double longitude;

    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }

    public Spittle( String message, Date time ) {
        this.id = null;
        this.message = message;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
