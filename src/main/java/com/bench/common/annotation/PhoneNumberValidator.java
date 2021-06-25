package com.bench.common.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author chimi
 */

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

  /**
   * Implements the validation logic. The state of {@code value} must not be altered.
   * <p>
   * This method can be accessed concurrently, thread-safety must be ensured by the implementation.
   *
   * @param phoneField object to validate
   * @param context    context in which the constraint is evaluated
   * @return {@code false} if {@code value} does not pass the constraint
   */

  @Override
  public boolean isValid(String phoneField, ConstraintValidatorContext context) {
    // can be null
    if (phoneField == null) {
      return true;
    }

    return phoneField.matches("^1\\d{10}$") && (phoneField.length() == 11);
  }
}