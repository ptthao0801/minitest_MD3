package org.example.minitest.service;

import org.example.minitest.model.Book;

import java.util.List;

public interface BookService {
    List<Book> showAll();
    void saveList(Book book);
    Book searchById(int id);
    void update(int id, Book book);
    void delete(int id);
}
