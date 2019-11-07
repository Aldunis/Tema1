package com.company;

public class Book {
    private String name;
    private String year;
    private String price;
    private String author;
    private String type;

    public Book(String name, String price) {
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void setNume(String nume) {
        this.name = "Harap-Alb";
    }

    private String getNume() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            book.getNume() .equals(this.getNume()) ;
            return false;
        } else {
            return false;
        }
    }
}


