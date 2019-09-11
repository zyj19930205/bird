package cn.zyj.blog.service.impl;

import cn.zyj.blog.dao.BookRepository;
import cn.zyj.blog.modal.Book;
import cn.zyj.blog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> getBookByPrice(String price) {
        return bookRepository.selectBybookPrice(price);
    }
}
