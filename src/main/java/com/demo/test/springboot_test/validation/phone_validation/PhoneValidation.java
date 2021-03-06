package com.demo.test.springboot_test.validation.phone_validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = PhoneValidationValidator.class)
@Target({METHOD,FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
public @interface PhoneValidation {
    String message() default  "手机号不正确";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    @Target({METHOD,FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        PhoneValidation[] value();
    }

}
