package com.epam.str;

public class ProgrammingBook extends  Book {

    private int yearPublished;
    private int checkList;

    public ProgrammingBook() {// super();
    super("", "" , 1);
    }

    public ProgrammingBook(String author, String title, double price, int yearPublished, int checkList) {
        super(author, title, price);
        System.out.println("public ProgrammingBook(String author, String title, double price, int yearPublished, int checkList)");
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
