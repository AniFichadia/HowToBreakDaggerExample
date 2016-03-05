package com.aniruddhfichadia.mydaggerexample.domain;


import com.aniruddhfichadia.mydaggerexample.framework.component.DaggerMyComponent;
import com.aniruddhfichadia.mydaggerexample.framework.module.MyModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
public class MyInjectedIntoClass
{
	// TODO Dagger inject annotations
	@Inject
	@Named("something1")
	MyInjectedClass myInjectedObject1;


	@Inject
	// TODO comment the @Named annotation to break the build
	@Named("something2")
	//TODO Change this to private to break the build
			MyInjectedClass myInjectedObject2;


	public MyInjectedIntoClass()
	{
		inject();
	}


	void inject()
	{
		// TODO Injection happens here. Use the dagger version of the component to perform
		// injection, they're prefixed with Dagger
		DaggerMyComponent.builder()
		                 .myModule(new MyModule())
		                 .build()
		                 .inject(this);
	}


	public void doSomething()
	{
		System.out.println(myInjectedObject1.toString());
		System.out.println(myInjectedObject2.toString());
	}
}
