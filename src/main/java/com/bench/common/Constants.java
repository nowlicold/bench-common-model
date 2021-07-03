package com.bench.common;

import java.nio.charset.Charset;

/**
 * 常量
 * 
 * @author cold
 *
 * @version $Id: Constants.java, v 0.1 2018年4月7日 下午5:32:11 cold Exp $
 */
public class Constants {

	/**
	 * 默认字符集
	 */
	public static final String DEFAULT_CHARSET = "UTF-8";

	/**
	 * 默认字符集
	 */
	public static final Charset DEFAULT_CHARSET_OBJECT = Charset.forName(DEFAULT_CHARSET);

	/**
	 * bench的版本
	 */
	public static final String VERSION = "1.3";

	/**
	 * 默认
	 */
	public static final String DEFAULT_STRING = "DEFAULT";

	/**
	 * 全匹配
	 */
	public static final String ALL_MATCH = "*";

	/**
	 * bench平台代码
	 */
	public static final String BENCH_PLATFORM_CODE = "bench";

	/**
	 * 应用的包开头
	 */
	public static final String APP_PACKAGE_START_WITH = "com.bench.app.";

	/**
	 * 脚本中表示接受的变量名
	 */
	public static final String SCRIPT_ACCPET_VAR_NAME = "accept";

	/**
	 * 未知
	 */
	public static final String UNKNOWN = "UNKNOWN";

}
