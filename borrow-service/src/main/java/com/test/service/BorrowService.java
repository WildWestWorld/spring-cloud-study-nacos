package com.test.service;

import com.test.entity.borrow.UserBorrowDetail;

/**
 * @author zzq
 * @date 2023年06月09日 12:40
 */
public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);


}
