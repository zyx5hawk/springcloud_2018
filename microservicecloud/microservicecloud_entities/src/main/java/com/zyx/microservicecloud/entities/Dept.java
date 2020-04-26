package com.zyx.microservicecloud.entities;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Dept implements Serializable {
	private Long deptno;
	private String dname;
	private String db_source;

	public Dept(String dname) {
		super();
		this.dname = dname;
	}

}
