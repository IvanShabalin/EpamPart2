package com.epam.str;

public class Main {
    public static void main(String[] args) {
    HomeLibrirary lib = new HomeLibrirary();
    //lib.add(new ProgrammingBook("java" , "shabalin", 1110.00, 2021, 400));
    //lib.add(new ChildrenBook("baby", "pusgkin", 420.40, 2002, 32));
    //lib.add(new AnymeBook("naruto", "kioRio", 188.15, 2007, 1173));

    ProgrammingBook prBook = new ProgrammingBook("java" , "shabalin", 1110.00, 2021, 400);
        System.out.println(prBook.getAuthor());

        System.out.println("___________________");

        ChildrenBook chBook = new ChildrenBook("kotlin", "utko", 1000.00, 2020, 456);
        System.out.println(chBook.getTitle());

        System.out.println("--------------------");

        ChildrenBook chBook2 = new ChildrenBook();
        System.out.println(chBook2.getTitle());
    }
}
