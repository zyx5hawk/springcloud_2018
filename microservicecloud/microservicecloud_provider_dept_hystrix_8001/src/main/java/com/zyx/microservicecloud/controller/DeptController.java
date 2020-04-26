package com.zyx.microservicecloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zyx.microservicecloud.entities.Dept;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/microservicecloud")
@Api(value = "UnifyController", description = "Unify algorithm service")
public class DeptController {

	@CrossOrigin(origins = "*")
	@ApiOperation(value = "", notes = "")
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		
		if(id<0)
		{
			throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
		}
		Dept d = new Dept();
		d.setDeptno(id);
		d.setDname(id.toString() + id.toString());
		
		return d;
	}

	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		Dept d = new Dept();
		d.setDeptno(999L);
		d.setDname("9999");
		return d;
	}

	@CrossOrigin(origins = "*")
	@ApiOperation(value = "", notes = "")
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		List<Dept> arr = new ArrayList<Dept>();

		Dept d = new Dept();
		d.setDeptno(3L);
		d.setDname("33");
		arr.add(d);

		d = new Dept();
		d.setDeptno(4L);
		d.setDname("44");
		arr.add(d);
		return arr;
	}

}
