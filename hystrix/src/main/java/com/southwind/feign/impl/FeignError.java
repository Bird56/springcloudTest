package com.southwind.feign.impl;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClent;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClent {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "系统维护中。。。。";
    }
}
