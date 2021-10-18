package com.epam.str;

public class AnymeBook  extends Book{
    private int yearPublished;
    private int checkList;

    public AnymeBook() {
    super("","",2);
    }

    public AnymeBook(String author, String title, double price, int yearPublished, int checkList) {
        super(author, title, price);
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
