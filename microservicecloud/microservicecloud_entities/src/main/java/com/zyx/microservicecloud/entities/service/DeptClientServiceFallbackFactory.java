package com.zyx.microservicecloud.entities.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zyx.microservicecloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
	@Override

	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public Dept get(long id) {
				Dept d = new Dept();
				d.setDeptno(id);
				d.setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
				return d;
			}
			@Override
			public List<Dept> list() {
				List<Dept> arr = new ArrayList<Dept>();
				Dept d = new Dept();
				d.setDeptno(1L);
				d.setDname("没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
				arr.add(d);
				return arr;
			}
		};
	}
}
