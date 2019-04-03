package com.xht.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xht.gmall.bean.BaseAttrInfo;
import com.xht.gmall.bean.BaseAttrValue;
import com.xht.gmall.manage.mapper.BaseAttrInfoMapper;
import com.xht.gmall.manage.mapper.BaseAttrValueMapper;
import com.xht.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;
    @Autowired
    BaseAttrValueMapper baseAttrValueMapper;

    @Override
    public List<BaseAttrInfo> getAttrList(String catalog3Id) {
        BaseAttrInfo baseAttrInfo = new BaseAttrInfo();
        baseAttrInfo.setCatalog3Id(catalog3Id);
        List<BaseAttrInfo> select = baseAttrInfoMapper.select(baseAttrInfo);
        return select;
    }

    @Override
    public void saveAttr(BaseAttrInfo baseAttrInfo) {
        // 把信息存入baseAttrInfo表中
        baseAttrInfoMapper.insertSelective(baseAttrInfo);

        // 里面封装的是BaseAttrValue对象
        List<BaseAttrValue> attrValueList = baseAttrInfo.getAttrValueList();

        for (BaseAttrValue baseAttrValue : attrValueList) {
            baseAttrValue.setAttrId(baseAttrInfo.getId());
            // 把信息插入baseAttrValue表中
            baseAttrValueMapper.insert(baseAttrValue);
        }
    }
}
