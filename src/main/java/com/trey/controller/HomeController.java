package com.trey.controller;

import com.trey.entity.PhoneBook;
import com.trey.service.PhonebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    private PhonebookService phonebookService;

    @RequestMapping(value = "/phonebook")
    public String end(Map<String, Object> map) throws Exception
    {
        map.put("list", phonebookService.getAll());
        map.put("test", "testText");
        return "test";
    }
}
