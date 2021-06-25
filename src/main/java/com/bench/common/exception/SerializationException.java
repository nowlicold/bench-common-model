/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bench.common.exception;

import com.bench.common.enums.error.ErrorEnum;
import com.bench.common.error.ErrorCode;

public class SerializationException extends BenchRuntimeException {

	public SerializationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <E extends BenchException> SerializationException(E exception) {
		super(exception);
		// TODO Auto-generated constructor stub
	}

	public <E extends BenchRuntimeException> SerializationException(E exception) {
		super(exception);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorCode errorCode, String message, Throwable throwable) {
		super(errorCode, message, throwable);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorCode errorCode, String message) {
		super(errorCode, message);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorCode errorCode, Throwable cause) {
		super(errorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorCode errorCode) {
		super(errorCode);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorEnum errorEnum, String message, Throwable throwable) {
		super(errorEnum, message, throwable);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorEnum errorEnum, String message) {
		super(errorEnum, message);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorEnum errorEnum, Throwable cause) {
		super(errorEnum, cause);
		// TODO Auto-generated constructor stub
	}

	public SerializationException(ErrorEnum errorEnum) {
		super(errorEnum);
		// TODO Auto-generated constructor stub
	}

	public <E extends BenchException> SerializationException(String message, E exception) {
		super(message, exception);
		// TODO Auto-generated constructor stub
	}

	public <E extends BenchRuntimeException> SerializationException(String message, E exception) {
		super(message, exception);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7876655310670539870L;

}
