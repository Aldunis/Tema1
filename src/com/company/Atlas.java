package com.company;


class Atlas extends Book {
    private String name;
    private String type;
    private String author;
    private String price;

    Atlas(String name, String price, String author, String type) { // defines the parameters to object Atlas
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    @Override
    public String toString() {   //access the super class parameters
        return "Atlas:" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price + "lei" +
                " " + super.toString();

    }

}




