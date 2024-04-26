import java.util.Date;

public class Comment extends Interactions{
protected String content;



    public Comment(int id, Date creactionTime, String content) {
        super(id, creactionTime);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
