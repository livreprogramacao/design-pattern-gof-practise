package behavioral.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookAuthorExpression extends BookAbstractExpression {
    public String interpret(BookInterpreterContext parm) {
        ArrayList<String> authors = parm.getAllAuthors();
        ListIterator<String> authorsIterator = authors.listIterator();

        StringBuilder titleBuffer = new StringBuilder();
        boolean first = true;
        while (authorsIterator.hasNext()) {
            if (!first) {
                titleBuffer.append(", ");
            } else {
                first = false;
            }
            titleBuffer.append((String) authorsIterator.next());
        }
        return titleBuffer.toString();
    }
}
