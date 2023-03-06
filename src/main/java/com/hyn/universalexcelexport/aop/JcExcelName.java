package com.hyn.universalexcelexport.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hyn
 * @version 1.0.0
 * @description
 * @date 2023/3/6
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JcExcelName {
    String name() default "";
}
