package com.test.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: qxd
 * @date: 2024/2/19
 * @description:
 */
@Data
public class Borrow {
    int id;
    int uid;
    int bid;
    Date date;
}