package lambdaBook;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBookList(){
        List<Book> book = new ArrayList();
        book.add(new Book(100,"Core Java",300));
        book.add(new Book(101,"Spring",330));
        book.add(new Book(102,"Hibernate",400));
        book.add(new Book(103,"React",230));
        book.add(new Book(104,"Spring boot",390));
        book.add(new Book(105,"Postgres",110));
        book.add(new Book(106,"MySql",209));
        book.add(new Book(107,"Node",210));
        book.add(new Book(108,"Python",521));
        book.add(new Book(109,"Microservices",307));
        book.add(new Book(110,"TypeScript",104));

        return book;

    }
}
