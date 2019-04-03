package com.xht.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xht.gmall.bean.BaseCatalog1;
import com.xht.gmall.bean.BaseCatalog2;
import com.xht.gmall.bean.BaseCatalog3;
import com.xht.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1() {
        List<BaseCatalog1> baseCatalog1s = catalogService.getCatalog1();
        return baseCatalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(String catalog1Id) {
        List<BaseCatalog2> baseCatalog2s = catalogService.getCatalog2(catalog1Id);
        return baseCatalog2s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String catalog2Id) {
        List<BaseCatalog3> baseCatalog3s = catalogService.getCatalog3(catalog2Id);
        return baseCatalog3s;
    }
}
