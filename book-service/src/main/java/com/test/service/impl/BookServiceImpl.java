package com.test.service.impl;

import com.test.entity.book.Book;
import com.test.mapper.BookMapper;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zzq
 * @date 2023年06月09日 11:14
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {
       Book book =  bookMapper.getBookByIdAPI(bid);
        return book;
    }
}

