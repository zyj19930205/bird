package cn.zyj.blog.controller;

import cn.zyj.blog.dao.BookRepository;
import cn.zyj.blog.modal.Book;
import cn.zyj.blog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class getInfoController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @RequestMapping(value="/getBookByPrice/{a}")
    public List<Book> getBookByPrice(@PathVariable("a") String price){
        System.out.println(price);
        return bookService.getBookByPrice(price);
    }


}
