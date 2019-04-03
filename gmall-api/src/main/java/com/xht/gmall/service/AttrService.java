package com.xht.gmall.service;

import com.xht.gmall.bean.BaseAttrInfo;

import java.util.List;

public interface AttrService {
    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);
}
