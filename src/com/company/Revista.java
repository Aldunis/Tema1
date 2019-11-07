package com.company;

class Revista extends Book {
    private String name;
    private String type;
    private String author;
    private String price;

    Revista(String name, String price, String author, String type) {
        ;
    }

    @Override
    public String toString() {        //access the super class parameters
        return "Revista:" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price + "lei" +
                " " + super.toString();
    }

    @Override
    void setNume(String nume) {
        super.setNume(nume);
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;

    }

}


