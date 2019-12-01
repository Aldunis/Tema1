package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public List<? extends Object> getList(Object e) {
        List<? extends Object> list = new ArrayList<>();
        if (e instanceof Book) {
            List<Book> listBooks1 = new ArrayList<Book>();
            list = listBooks1;
        }
        return list;

    }
}
