package com.gcj.mycloud.service;

import com.gcj.mycloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(-1L).setDname("该ID："+id+"没有对应的信息,Consumer客户端提供的降级信息，此刻服务Provider已经关闭").setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
