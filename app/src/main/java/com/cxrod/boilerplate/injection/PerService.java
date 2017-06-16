package com.cxrod.boilerplate.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by crodriguez on 6/14/17.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerService {
}