package com.bench.common.annotation;

import java.lang.annotation.*;

/**
 * 数据库字段注解
 * 
 * @author cold
 * 
 * @version $Id: DBColumn.java, v 0.1 2014-4-6 上午10:56:54 cold Exp $
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface DBColumn {

	/**
	 * 数据库字段名
	 * 
	 * @return
	 */
	String name();

	/**
	 * 是否可空
	 * 
	 * @return
	 */
	boolean nullable();

	/**
	 * 默认值
	 */
	String dataDefault();

	/**
	 * 数据字节长度
	 */
	int dataLength();

	/**
	 * 数据类型
	 * 
	 * @return
	 */
	String dataType();

	/*
	 * 列相关数据类型(数字类型)的具体长度(有效位数),一个十进制数(NUMBER类型),或一个二进制数((FLOAT类型)
	 */
	int dataPrecision();

	/*
	 * 字段类型的精度范围，如果为0,表示只能存储为整数
	 */
	int dataScale();

	/**
	 * 字段描述
	 * 
	 * @return
	 */
	String comments();

}
