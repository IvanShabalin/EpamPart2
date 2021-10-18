package com.epam.str;

import java.util.ArrayList;
import java.util.List;

public class HomeLibrirary {
    // private List<ProgrammingBook> programmingBooks;
    // private List<ChildrenBook> childrenBooks;

    private List<Book> books;

    public HomeLibrirary() {
        this.books = new ArrayList<Book>();
    }

    public HomeLibrirary(List<Book> books) {
        super();
        this.books = books;
    }
    public void add ( Book b) {
        books.add(b);
    }
}
