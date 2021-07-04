/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.bench.common.http.enums;

import com.bench.common.enums.EnumBase;

/**
 * HTTP版本
 * 
 * @author cold
 *
 * @version $Id: HttpVersionEnum.java, v 0.1 2018年1月27日 下午11:29:33 cold Exp $
 */
public enum HttpVersionEnum implements EnumBase {

	HTTP_0_9,

	HTTP_1_0,

	HTTP_1_1;

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return this.name();
	}

	@Override
	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
