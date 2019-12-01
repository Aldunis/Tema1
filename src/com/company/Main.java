package com.company;
import org.springframework.asm.MethodTooLargeException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static  void main(String[] args) {
        List<Book> lista = new ArrayList<>(); //we instantiate a new array list
        try {
            File tema = new File("D:\\Curs\\tema.txt"); //locates the file we want to open
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
                    Revista r = new Revista(name , price , author , type); // we define parameters to constructor Revista
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
        MethodTooLargeException mtd;
    }
}




