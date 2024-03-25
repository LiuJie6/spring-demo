package org.example.springdemo.service;

public interface RedisDemoService {

    void setKeyValues(String key, Object value);

    Object getValueByKey(String key);
}
