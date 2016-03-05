package com.aniruddhfichadia.mydaggerexample.domain;


import com.aniruddhfichadia.mydaggerexample.framework.component.DaggerMyComponent;
import com.aniruddhfichadia.mydaggerexample.framework.module.MyModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
public class MyOtherInjectedIntoClass
{
	@Inject
	// TODO highlight commenting the @Named annotation
	@Named("something1")
	MyInjectedClass myInjectedObject;

	@Inject
	SomethingElse somethingElse;


	public MyOtherInjectedIntoClass()
	{
		inject();
	}


	void inject()
	{
		DaggerMyComponent.builder()
		                 .myModule(new MyModule())
		                 .build()
		                 .inject(this);
	}


	public void doSomething()
	{
		System.out.println(myInjectedObject.toString());
	}
}
