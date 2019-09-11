package cn.zyj.blog.dao;

import cn.zyj.blog.modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("select b.bookname from Book b where b.bookprice=?1")
    List<Book> selectBybookPrice(String bookPrice);
}
