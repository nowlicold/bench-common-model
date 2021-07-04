/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.bench.common.http.enums;

import com.bench.common.enums.EnumBase;

/**
 * 
 * @author cold
 *
 * @version $Id: UserAgentEnum.java, v 0.1 2018年5月8日 下午6:41:28 cold Exp $
 */
public enum UserAgentEnum implements EnumBase {

	_360SE("360极速浏览器", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36 QIHU 360EE"),

	FIREFOX("火狐浏览器", "Mozilla/5.0 (Windows NT 10.0; …) Gecko/20100101 Firefox/63.0"),

	MICROSOFT_EDGE("微软EDGE浏览器", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 Edge/16.16299");

	private String message;

	private String userAgent;

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	public String userAgent() {
		return userAgent;
	}

	private UserAgentEnum(String message, String userAgent) {
		this.userAgent = userAgent;
		this.message = message;
	}

	@Override
	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}

}
