package behavioral.interpreter;

import java.util.ArrayList;

public class BookInterpreterContext {
    private final ArrayList<String> titles = new ArrayList<>();
    private final ArrayList<String> authors = new ArrayList<>();
    private final ArrayList<TitleAndAuthor> titlesAndAuthors = new ArrayList<>();

    public void addTitle(String title) {
        titles.add(title);
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public void addTitleAndAuthor(TitleAndAuthor titleAndAuthor) {
        titlesAndAuthors.add(titleAndAuthor);
    }

    public ArrayList<String> getAllTitles() {
        return titles;
    }

    public ArrayList<String> getAllAuthors() {
        return authors;
    }

    public ArrayList<String> getAuthorsForTitle(String titleIn) {

        ArrayList<String> authorsForTitle = new ArrayList<>();
        TitleAndAuthor tempTitleAndAuthor;

        for (TitleAndAuthor titlesAndAuthor : titlesAndAuthors) {
            tempTitleAndAuthor = titlesAndAuthor;
            if (titleIn.equals(tempTitleAndAuthor.getTitle())) {
                authorsForTitle.add(tempTitleAndAuthor.getAuthor());
            }
        }

        return authorsForTitle;
    }

    public ArrayList<String> getTitlesForAuthor(String authorIn) {

        ArrayList<String> titlesForAuthor = new ArrayList<>();
        TitleAndAuthor tempTitleAndAuthor;

        for (TitleAndAuthor titlesAndAuthor : titlesAndAuthors) {
            tempTitleAndAuthor = titlesAndAuthor;

            if (authorIn.equals(tempTitleAndAuthor.getAuthor())) {
                titlesForAuthor.add(tempTitleAndAuthor.getTitle());
            }
        }
        return titlesForAuthor;
    }
}
