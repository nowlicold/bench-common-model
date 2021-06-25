package com.bench.common.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 实现此接口的异常, 是由另一个异常引起的.
 * 
 * @author cold
 * @version $Id: ChainedThrowable.java,v 0.1 2009-5-21 上午12:18:11 cold Exp $
 */
public interface ChainedThrowable {
	/**
	 * 取得异常的起因.
	 * 
	 * @return 异常的起因.
	 */
	Throwable getCause();

	/**
	 * 打印调用栈到标准错误.
	 */
	void printStackTrace();

	/**
	 * 打印调用栈到指定输出流.
	 * 
	 * @param stream
	 *            输出字节流.
	 */
	void printStackTrace(PrintStream stream);

	/**
	 * 打印调用栈到指定输出流.
	 * 
	 * @param writer
	 *            输出字符流.
	 */
	void printStackTrace(PrintWriter writer);

	/**
	 * 打印异常的调用栈, 不包括起因异常的信息.
	 * 
	 * @param writer
	 *            打印到输出流
	 */
	void printCurrentStackTrace(PrintWriter writer);
}
