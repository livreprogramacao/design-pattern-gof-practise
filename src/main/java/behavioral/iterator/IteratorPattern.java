package behavioral.iterator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorPattern {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern Demonstration.");
        log.info("-------------------------------");
        log.info("teste");

        System.out.println("Building string array of books.");
        String[] books = new String[8];
        books[0] = "PowerBuilder Developers Guide, 1994";
        books[1] = "Informix Developers Guide, 1995";
        books[2] = "Informix Universal Data Option, 1996";
        books[3] = "SQL Server Developers Guide, 1999";
        books[4] = "SilverStream Success I, 1999";
        books[5] = "SilverStream Success II, 2000";
        books[6] = "J2EE Unleashed, 2001";
        books[7] = "Enterprise Architect Study Guide, 2002";

        // Turn the string array into a collection.
        System.out.println("Turning string array into a collection.");
        CollectionIF collection = new ConcreteCollection(books);

        // Get an iterator for the collection.
        System.out.println("Getting an iterator for the collection..");
        IteratorIF iterator = collection.iterator();

        // Iterate through and print each object in the list.
        System.out.println("Iterate through the list.");
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println((++i) + " " + iterator.next());
        }
        System.out.println();
    }
}