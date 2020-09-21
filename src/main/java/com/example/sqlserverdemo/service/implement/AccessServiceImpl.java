package com.example.sqlserverdemo.service.implement;

import com.example.sqlserverdemo.dao.AccessDao;
import com.example.sqlserverdemo.entity.Access;
import com.example.sqlserverdemo.service.AccessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class AccessServiceImpl implements AccessService {
    @Resource
    AccessDao accessDao;

    @Override
    public String getLicense(int id) {
        Access access = accessDao.getById(id);
        return access.getLicense();
    }

    @Override
    public void insert(Access access) {
        accessDao.save(access);
    }
}
