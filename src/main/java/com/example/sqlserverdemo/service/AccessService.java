package com.example.sqlserverdemo.service;

import com.example.sqlserverdemo.entity.Access;
import org.springframework.stereotype.Service;

public interface AccessService {

    String getLicense(int id);

    void insert(Access access);
}
