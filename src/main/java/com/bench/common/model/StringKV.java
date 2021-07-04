/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.bench.common.model;

/**
 * 
 * @author cold
 *
 * @version $Id: StringKV.java, v 0.1 2016年2月24日 下午1:08:53 cold Exp $
 */
public class StringKV extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5089234061709688808L;

	/**
	 * 键
	 */
	private String key;

	/**
	 * 值
	 */
	private String value;

	public StringKV() {
		super();
	}

	public StringKV(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	/**
	 * @return Returns the key.
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            The key to set.
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return Returns the value.
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            The value to set.
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
