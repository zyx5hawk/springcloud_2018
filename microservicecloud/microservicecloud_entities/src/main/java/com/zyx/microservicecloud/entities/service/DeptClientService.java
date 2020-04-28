package com.zyx.microservicecloud.entities.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zyx.microservicecloud.entities.Dept;

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {
	@RequestMapping(value = "/microservicecloud/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/microservicecloud/dept/list", method = RequestMethod.GET)
	public List<Dept> list();
}
