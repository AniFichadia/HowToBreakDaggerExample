package com.aniruddhfichadia.mydaggerexample.domain;


/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
public class MyInjectedClass
{
	private MyRequiredClass myRequiredClass;


	public MyInjectedClass(MyRequiredClass myRequiredClass)
	{
		this.myRequiredClass = myRequiredClass;
	}


	@Override
	public String toString()
	{
		return "MyInjectedClass{" +
		       "myRequiredClass=" + myRequiredClass.toString() +
		       '}';
	}
}
