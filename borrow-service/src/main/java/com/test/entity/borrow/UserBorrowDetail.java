package com.test.entity.borrow;

import com.test.entity.book.Book;
import com.test.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


/**
 * @author zzq
 * @date 2023年06月09日 12:43
 */

//@AllArgsConstructor  是一个 Lombok 注解
//        用于自动生成一个包含所有参数的构造函数。
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
