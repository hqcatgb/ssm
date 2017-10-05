package com.hqc.ten.service;

import com.hqc.ten.domain.Ad;

import java.util.List;


public interface IAdService {


    Ad Find(int id);

    int Add(Ad model);

    List<Ad> All();
}
