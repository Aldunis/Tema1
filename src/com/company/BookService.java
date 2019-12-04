package com.company.Service;

import com.company.Model.Atlas;
import com.company.Model.Book;
import com.company.Model.Revista;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private List<Book> lista;

    public BookService(){
        lista = new ArrayList<>();
        try {
            File tema = new File("D://Curs//tema.txt"); //locates the file we want to open
            Scanner sc = new Scanner(tema); //opens the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine(); //checks if we have more than one line
                String[] content = (line).split(";"); // we use the simbol ";" to split the words
                String name = content[0];
                Double price = Double.valueOf(content[1]);
                String author = content[2];
                String type = content[3];
                if (type.equals("atlas")) {
                    Atlas a = new Atlas(name, price, author, type); // we define parameters to constructor Atlas
                    a.setName(content[0]);
                    a.setPrice(Double.valueOf(content[1]));
                    a.setAuthor(content[2]);
                    a.setType(content[3]);
                    lista.add(a); // adds the object "Atlas a" to the list
                } else if (type.equals("revista")) {
                    Revista r = new Revista(name, price, author, type); // we define parameters to constructor Revista
                    r.setName(content[0]);
                    r.setPrice(Double.valueOf(content[1]));
                    r.setAuthor(content[2]);
                    r.setType(content[3]);
                    lista.add(r); // adds the object "Revista r" to the list
                }

            }
            lista.forEach(System.out::println);
        } catch (FileNotFoundException | NumberFormatException ex) {
            System.out.println("Fisierul nu s-a gasit");
            ex.printStackTrace();
        }
    }


        //CRUD

        //C create

        public void populationResource () {
            //load from file
        }
        public void addBook (Book book){
            lista.add(book);
        }
        //R read
        public Book getBookbyIndex ( int index){
            return lista.get(index);
        }
        public Book getBookbyName (String BookName){
            for (Book book : lista) {
                if (book.getName().equals(BookName)) {
                    return book;
                }
            }
            return null;
        }
        //U Update

        public void updateBook (Book oldBook, Book updatedBook){
            Book foundBook = getBookbyName(oldBook.getName());
            //metoda1
            lista.set(lista.indexOf(foundBook), updatedBook);
            //metoda2
            foundBook.setAuthor(updatedBook.getAuthor());

        }
        public void deleteBook (Book book){
            lista.remove(getBookbyName(book.getName()));
        }
        public int getNrofBooks() {
        return lista.size();
        }
}

