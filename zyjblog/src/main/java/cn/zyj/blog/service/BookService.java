package cn.zyj.blog.service;

import cn.zyj.blog.dao.BookRepository;
import cn.zyj.blog.modal.Book;

import java.util.List;

public interface BookService{
    List<Book> getBookByPrice(String price);
}
