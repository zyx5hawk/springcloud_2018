package com.zyx.microservicecloud.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
	public Dept get(@PathVariable("id") Long id) {
		Dept d = new Dept();
		d.setDeptno(id);
		d.setDname(id.toString() + id.toString());
		return d;
	}

	@CrossOrigin(origins = "*")
	@ApiOperation(value = "", notes = "")
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		List<Dept> arr = new ArrayList<Dept>();

		Dept d = new Dept();
		d.setDeptno(1L);
		d.setDname("11");
		arr.add(d);

		d = new Dept();
		d.setDeptno(2L);
		d.setDname("22");
		arr.add(d);
		return arr;
	}

}
