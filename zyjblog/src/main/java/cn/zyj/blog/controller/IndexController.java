package cn.zyj.blog.controller;

import cn.zyj.blog.dao.BookRepository;
import cn.zyj.blog.modal.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/hello")
    public String hello(){
        return "admin/admin";
    }
    @GetMapping("/saveBook")
    public String saveBook(Model model){
        model.addAttribute("book",new Book());
        return "admin/addBook";
    }

    @PostMapping("/saveBook")
    public String saveBook(Book book){
        bookRepository.save(book);
        return "redirect:/hello";
    }


}
