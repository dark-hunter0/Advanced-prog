import java.util.Date;

public class Interactions {
    protected int id;
    protected Date creactionTime;

    public Interactions() {
    }

    public Interactions(int id, Date creactionTime) {
        this.id = id;
        this.creactionTime = creactionTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreactionTime() {
        return creactionTime;
    }

    public void setCreactionTime(Date creactionTime) {
        this.creactionTime = creactionTime;
    }
}
