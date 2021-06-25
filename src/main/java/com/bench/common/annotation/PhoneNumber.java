package com.bench.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 验证手机号<br/> 正确的手机号由11位数字组成，第一位为1
 *
 * @author chimi
 */


@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumber {

  String message() default "手机号格式错误";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
