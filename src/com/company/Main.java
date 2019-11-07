package com.company;
import javafx.collections.transformation.SortedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static <Mylist> void main(String[] args) {
        List<Book> lista = new ArrayList<>(); //we instantiate a new array list
        try {
            File tema = new File("D:\\Curs\\tema.txt"); //locates the file we want to open
            Scanner sc = new Scanner(tema); //opens the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine(); //checks if we have more than one line
                String[] content = (line).split(";"); // we use the simbol ";" to split the words
                String name = content[0];
                String price = content[1];
                String author = content[2];
                String type = content[3];
                if (type.equals("atlas")) {
                    Atlas a = new Atlas(name, price, author, type); // we define parameters to constructor Atlas
                    a.setName(content[0]);
                    a.setPrice(content[1]);
                    a.setAuthor(content[2]);
                    a.setType(content[3]);
                    lista.add(a); // adds the object "Atlas a" to the list
                } else if (type.equals("revista")) {
                    Revista r = new Revista(name , price , author , type); // we define parameters to constructor Revista
                    r.setName(content[0]);
                    r.setPrice(content[1]);
                    r.setAuthor(content[2]);
                    r.setType(content[3]);
                    lista.add(r); // adds the object "Revista r" to the list
                }

            }
            lista.forEach(System.out::println);
        } catch (FileNotFoundException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
class Mylist extends Book implements Comparator<Book>  {
        private SortedList Mylist = new SortedList<>();
        Iterator<String> itr = Mylist.iterator();
        public String price;

    public Mylist() {
    }

    public String getPrice () {
            return price;
        }

        public void setPrice (String price){
            this.price = price;
        }

        public int size () {
            return Mylist.size();
        }

        public Iterator<Book> iterator () {
            return Mylist.iterator();
        }

        public boolean add (Book book){
            return Mylist.add(book);
        }

        public boolean remove (Object o){
            return Mylist.remove(o);
        }

    public Mylist(List obj) {
        super();
        Mylist = (SortedList) obj;
            new Mylist(new ArrayList());

        }

    @Override
    public int compare(Book book, Book t1) {
            int comparatie = book.getName().compareTo(t1.getName());
        return (comparatie != 0) ? comparatie : book.getPrice().compareTo(t1.getPrice());
    }
    public static void main(String[] args) {
        ArrayList<Book> lista = new ArrayList<Book>(Arrays.asList(
                new Book("Harap-Alb","18"),
                new Book("Alba ca zapada","200"),
                new Book("Luceafarul","300")
        ));
        Collections.sort(lista , new Mylist());
        System.out.println("Sorted");
        for (Book book : lista) {
            System.out.println( book.getName() + " " + book.getPrice());
        }
    }

}




