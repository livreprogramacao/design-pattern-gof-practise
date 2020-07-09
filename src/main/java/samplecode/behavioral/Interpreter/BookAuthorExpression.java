package samplecode.behavioral.Interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookAuthorExpression extends BookAbstractExpression {
    public String interpret(BookInterpreterContext parm) {
        ArrayList authors = parm.getAllAuthors();
        ListIterator authorsIterator = authors.listIterator();

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
