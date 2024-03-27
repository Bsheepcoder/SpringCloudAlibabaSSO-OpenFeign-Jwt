package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.xml.ws.spi.http.HttpContext;

/**
 * @author: qxd
 * @date: 2024/2/19
 * @description:
 */
@RestController
public class BookController {

    @Resource
    BookService service;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid){
        //拿到用户信息
        SecurityContext context =  SecurityContextHolder.getContext();
        System.out.println(context.getAuthentication());
        return service.getBookById(bid);
    }

    @RequestMapping("/book/remain/{bid}")
    public int bookRemain(@PathVariable("bid") int bid){
        return service.getRemain(bid);
    }

    @RequestMapping("/book/borrow/{bid}")
    public boolean bookBorrow(@PathVariable("bid") int bid){
        int remain = service.getRemain(bid);
        return service.setRemain(bid, remain - 1);
    }
}
