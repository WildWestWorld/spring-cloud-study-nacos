package com.test.controller;

import com.test.entity.book.Book;
import com.test.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zzq
 * @date 2023年06月09日 11:20
 */
@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book getBookById(@PathVariable("bid") int bid ){
        Book book =  bookService.getBookById(bid);
        return book;
    }
}
