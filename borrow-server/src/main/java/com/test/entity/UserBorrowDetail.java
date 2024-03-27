package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.test.entity.Book;
import java.util.List;

/**
 * @author: qxd
 * @date: 2024/2/19
 * @description:
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}