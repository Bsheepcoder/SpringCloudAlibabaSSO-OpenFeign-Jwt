package com.test.service;

import com.test.entity.Borrow;
import com.test.entity.UserBorrowDetail;

/**
 * @author: qxd
 * @date: 2024/2/19
 * @description:
 */
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);

    boolean doBorrow(int uid, int bid);
}