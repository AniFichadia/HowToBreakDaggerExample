package com.aniruddhfichadia.mydaggerexample.framework.scopes;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
// TODO custom scope annotation, currently not used.
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity
{
}
