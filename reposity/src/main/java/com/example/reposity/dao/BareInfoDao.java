package com.example.reposity.dao;

import com.example.reposity.bean.BareInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BareInfoDao {

    List<BareInfo> findAll();
    void add(BareInfo bareInfo);
}
