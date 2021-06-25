package com.bench.common.enums.common;


import com.bench.common.enums.EnumBase;

/**
 * 签名秘钥类型
 * 
 * @author cold
 *
 * @version $Id: SignTypeEnum.java, v 0.1 2018年1月16日 下午3:34:30 cold Exp $
 */
public enum SignTypeEnum implements EnumBase {

	RSA(false),

	DSA(false),

	MD5(true),

	SHA(true),

	MAC(true),

	EC(true);

	/**
	 * 是否对称签名
	 */
	private boolean symmetric;

	private SignTypeEnum(boolean symmetric) {
		this.symmetric = symmetric;
	}

	public boolean symmetric() {
		return symmetric;
	}

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
