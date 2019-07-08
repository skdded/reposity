package com.example.reposity.service;

import com.example.reposity.bean.BareInfo;

import java.util.List;

public interface BareInfoService {
    List<BareInfo> findAll();
    void  add(BareInfo bareInfo);
}
