package com.bench.common.exception;

public class ClassInstantiationException extends ChainedException {
	/**
	 * 构造一个空的异常.
	 */
	public ClassInstantiationException() {
		super();
	}

	/**
	 * 构造一个异常, 指明异常的详细信息.
	 * 
	 * @param message
	 *            详细信息
	 */
	public ClassInstantiationException(String message) {
		super(message);
	}

	/**
	 * 构造一个异常, 指明引起这个异常的起因.
	 * 
	 * @param cause
	 *            异常的起因
	 */
	public ClassInstantiationException(Throwable cause) {
		super(cause);
	}

	/**
	 * 构造一个异常, 指明引起这个异常的起因.
	 * 
	 * @param message
	 *            详细信息
	 * @param cause
	 *            异常的起因
	 */
	public ClassInstantiationException(String message, Throwable cause) {
		super(message, cause);
	}
}
