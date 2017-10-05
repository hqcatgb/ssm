package com.hqc.ten.service.impl;

import com.hqc.ten.dao.IAdDao;
import com.hqc.ten.domain.Ad;
import com.hqc.ten.service.IAdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdServiceImpl implements IAdService {

    @Resource
    private IAdDao adDao;


    public Ad Find(int id) {

        Ad ad = new Ad();
        ad.setId(id);
        ad.setName("魅族又出蓝" + id + "了啊!");
        return ad;
    }


    public int Add(Ad model) {

        return this.adDao.insert(model);
    }

    public List<Ad> All() {

        return this.adDao.all();
    }
}
