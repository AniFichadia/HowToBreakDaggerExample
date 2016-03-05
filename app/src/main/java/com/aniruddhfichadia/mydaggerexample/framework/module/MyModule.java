package com.aniruddhfichadia.mydaggerexample.framework.module;


import com.aniruddhfichadia.mydaggerexample.domain.MyInjectedClass;
import com.aniruddhfichadia.mydaggerexample.domain.MyRequiredClass;
import com.aniruddhfichadia.mydaggerexample.domain.SomethingElse;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
@Module
public class MyModule
{
	// TODO scoped provider method. Note: the scope only applies to the current instance of your
	// component
	@Provides
	@Singleton
	protected MyRequiredClass providesMyRequiredClass()
	{
		return new MyRequiredClass();
	}


	@Provides
	@Named("something1")
	public MyInjectedClass providesMyInjectedClass1(MyRequiredClass m)
	{
		return new MyInjectedClass(m);
	}


	@Provides
	// TODO remove the @Named annotation out
	@Named("something2")
	public MyInjectedClass providesMyInjectedClass2(MyRequiredClass m)
	{
		return new MyInjectedClass(m);
	}


	// TODO Remove the @Provides annotation to break the build
	@Provides
	public SomethingElse providesSomethingElse()
	{
		return new SomethingElse();
	}
}