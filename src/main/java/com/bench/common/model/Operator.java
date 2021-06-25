package com.bench.common.model;

import java.io.Serializable;

/**
 * 操作员
 * 
 * @author cold
 * 
 * @version $Id: Operator.java, v 0.1 2010-8-25 下午03:45:36 cold Exp $
 */
public interface Operator extends Serializable {

	/**
	 * 获取操作者ID
	 * 
	 * @return
	 */
	public String acquireUserId();

	/**
	 * 获取操作者名称
	 * 
	 * @return
	 */
	public String acquireUserName();
}
