package behavioral.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookAuthorTitleExpression extends BookAbstractExpression {
    final String title;

    public BookAuthorTitleExpression(String parm) {
        title = parm;
    }

    public String interpret(BookInterpreterContext parm) {
        ArrayList<String> authorsAndTitles = parm.getAuthorsForTitle(title);
        ListIterator<String> authorsAndTitlesIterator = authorsAndTitles.listIterator();
        StringBuilder authorBuffer = new StringBuilder();
        boolean first = true;
        while (authorsAndTitlesIterator.hasNext()) {
            if (!first) {
                authorBuffer.append(", ");
            } else {
                first = false;
            }
            authorBuffer.append((String) authorsAndTitlesIterator.next());
        }
        return authorBuffer.toString();
    }
}
