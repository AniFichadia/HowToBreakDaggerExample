package com.aniruddhfichadia.mydaggerexample.framework.component;


import com.aniruddhfichadia.mydaggerexample.domain.MyInjectedIntoClass;
import com.aniruddhfichadia.mydaggerexample.domain.MyOtherInjectedIntoClass;
import com.aniruddhfichadia.mydaggerexample.framework.module.MyModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
// TODO Removed the @Singleton scope annotation to break the build. If modules have scoped
// provider methods, the Component requires a scope
@Singleton
// TODO Dagger components are annotated with @Component and are interfaces.
@Component(modules = MyModule.class)
public interface MyComponent
{
	void inject(MyInjectedIntoClass foo);


	void inject(MyOtherInjectedIntoClass bar);
}
