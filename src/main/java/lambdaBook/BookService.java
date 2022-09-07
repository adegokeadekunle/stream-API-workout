package lambdaBook;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getBookListInSortedOrder(){
        List<Book> books = (List<Book>) new BookDAO().getBookList();
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName())); //sort in ascending order
      //  Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName())); // desending order
        System.out.println(books);
        return books;

    }

    public static void main(String[] args) {
        BookService service = new BookService();
        service.getBookListInSortedOrder();
    }
}
