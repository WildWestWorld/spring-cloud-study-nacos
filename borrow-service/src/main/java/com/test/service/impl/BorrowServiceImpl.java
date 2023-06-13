package com.test.service.impl;

import com.test.entity.book.Book;
import com.test.entity.borrow.Borrow;
import com.test.entity.borrow.UserBorrowDetail;
import com.test.entity.user.User;
import com.test.mapper.BorrowMapper;
import com.test.service.BorrowService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zzq
 * @date 2023年06月09日 12:41
 */
@Service
public class BorrowServiceImpl implements BorrowService {
    @Resource
    BorrowMapper borrowMapper;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int bid) {
        List<Borrow> borrowList = borrowMapper.getBorrowByUidAPI(bid);

        //利用RestTemplate 进行远程调用查询
        //因为 当前的服务只能查询uid和pid
        //现在我们要用uid 和pid去拿到对应的数据
        RestTemplate template = new RestTemplate();
        String queryUserBaseUrl = "http://localhost:8401/user/";
//        调用 getForObject 来调用/请求其他服务
        User user = template.getForObject(queryUserBaseUrl + bid, User.class);
//        获取每本书的详情
//        利用borrowList 的条数=bid的数量
        //利用For循环 循环查询租借的书籍的信息
        String queryBookBaseUrl = "http://localhost:8201/book/";
        List<Book> bookList = borrowList.stream().map(item -> template.getForObject(queryBookBaseUrl + item.getBid(), Book.class)).collect(Collectors.toList());
//        创建变量userBorrowDetail 装填
        UserBorrowDetail userBorrowDetail = new UserBorrowDetail(user,bookList);

        return userBorrowDetail;
    }
}
