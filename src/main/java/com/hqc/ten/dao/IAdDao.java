package com.hqc.ten.dao;


import com.hqc.ten.domain.Ad;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface IAdDao {

    public  int insert(@Param("pojo") Ad pojo);

    public  List<Ad> all();

    public  int update(Ad pojo);

}
