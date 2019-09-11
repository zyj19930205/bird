package cn.zyj.blog.modal;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookname;
    private String bookprice;
    private String bookinfo;
    private String imgurl;

}
