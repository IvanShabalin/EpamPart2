package com.epam.str;

public class ChildrenBook  extends Book {
    private int yearPublished;
    private int checkList;

    public ChildrenBook() {
    super("kottt","asdc", 1213.00);
    }

    public ChildrenBook(String author, String title, double price, int yearPublished, int checkList) {
        super();
        System.out.println("public ChildrenBook(String author, String title, double price, int yearPublished, int checkList)");
        setAuthor(author);
        setPrice(price);
        setTitle(title);
        this.yearPublished = yearPublished;
        this.checkList = checkList;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getCheckList() {
        return checkList;
    }

    public void setCheckList(int checkList) {
        this.checkList = checkList;
    }


}
