package org.example.springdemo.service.impl;

import org.example.springdemo.service.RedisDemoService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisDemoServiceImpl implements RedisDemoService {

    /**
     * redis IO多路服用、纯内存操作
     * 单线程、
     * 全局hash表，对key做hash运算
     * String存储：
     * Set存储：微信抽奖小程序、关注模型
     * ZSet存储：排行榜（
     *   压缩列表（ziplist）
     *   跳表(skiplist)：多了索引层，将有序链表改造为支持“折半查找”算法，可以进行快速的插入、删除、查找操作）
     *   调表可以设置：
     *   zset-max-ziplist-entries:128 //元素个数超过128，使用skiplist
     *   zset-max-ziplist-value:64  //单个元素大小超过64byte，使用skiplist
     * Hash存储:一个对象有多个字段，一般只更新其中某两个字段时 诸如实现购物车：
     * List存储：栈（Stack-先进后出：）、队列、阻塞队列（类似于监听）;实际应用场景：微博、公众号的消息流
     *
     *
     */
    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public void setKeyValues(String key, Object value) {
        this.redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public Object getValueByKey(String key) {
        return this.redisTemplate.opsForValue().get(key);
    }
}
