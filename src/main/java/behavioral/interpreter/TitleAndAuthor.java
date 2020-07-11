package behavioral.interpreter;

public class TitleAndAuthor {
    private final String title;
    private final String author;

    public TitleAndAuthor(String parm1, String parm2) {
        title = parm1;
        author = parm2;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
