/**
 * BenchCode.com Inc.
 * Copyright (c) 2005-2009 All Rights Reserved.
 */
package com.bench.common.annotation;

import java.lang.annotation.*;

/**
 * 数据库表注解
 * 
 * @author cold
 * 
 * @version $Id: DBTable.java, v 0.1 2014-4-6 上午11:03:32 cold Exp $
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface DBTable {
	/**
	 * 数据库表名
	 * 
	 * @return
	 */
	String name();

	/**
	 * 表描述
	 * 
	 * @return
	 */
	String comments();
}
