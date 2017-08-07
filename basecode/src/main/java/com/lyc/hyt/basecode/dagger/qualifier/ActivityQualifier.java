package com.lyc.hyt.basecode.dagger.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by lyc on 2017/8/7.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ActivityQualifier {
    String value() default "";
}
