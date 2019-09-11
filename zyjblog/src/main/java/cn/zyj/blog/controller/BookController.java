package cn.zyj.blog.controller;

import cn.zyj.blog.dao.BookRepository;
import cn.zyj.blog.modal.Book;
import cn.zyj.blog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;


    @RequestMapping("/getBookList")
    public ModelAndView getBookList(){
        List<Book> books=bookRepository.findAll();
        System.out.println(books);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("books",books);
        return modelAndView;
    }
    @GetMapping("/deleteBookById/{id}")
    public String deleteBookById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
        return "forward:/getBookList";
    }

}
