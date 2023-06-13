package com.test.controller;

import com.test.entity.borrow.UserBorrowDetail;
import com.test.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zzq
 * @date 2023年06月09日 13:48
 */
@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;
    @RequestMapping("/borrow/{uid}")
    public UserBorrowDetail getBorrowByUid(@PathVariable("uid") int uid){
        UserBorrowDetail userBorrowDetail =  borrowService.getUserBorrowDetailByUid(uid);
        return  userBorrowDetail;
    };

}
