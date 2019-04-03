package com.xht.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("attrListPage")
    public String attrListPage() {
        return "attrListPage";
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }

}
