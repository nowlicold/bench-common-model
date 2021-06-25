package com.bench.common.enums.error;

import com.bench.common.enums.EnumBase;
import com.bench.common.error.ErrorCode;

/**
 * 错误枚举
 * 
 * @author cold
 * @version $Id: ErrorEnum.java,v 0.1 2008-12-30 上午10:22:20 cold Exp $
 */
public interface ErrorEnum extends EnumBase {

	/**
	 * 是否相等
	 * 
	 * @param errorCode
	 * @return
	 */
	public default boolean equals(ErrorCode errorCode) {
		return this.name().equals(errorCode.getName());
	}

	public default ErrorCode errorCode() {
		return new ErrorCode(name(), message());
	}
}
