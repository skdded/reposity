package com.example.reposity.service.impl;

import com.example.reposity.bean.BareInfo;
import com.example.reposity.dao.BareInfoDao;
import com.example.reposity.service.BareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BareInfoServiceImpl implements BareInfoService {

    @Autowired
    private BareInfoDao bareInfoDao;

    @Override
    public List<BareInfo> findAll() {
        List<BareInfo> userList = bareInfoDao.findAll();
        return userList;

    }

    @Override
    public void add(BareInfo bareInfo) {
        bareInfoDao.add(bareInfo);
    }
}
