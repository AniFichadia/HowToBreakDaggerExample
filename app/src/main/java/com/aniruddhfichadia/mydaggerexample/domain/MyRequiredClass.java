package com.aniruddhfichadia.mydaggerexample.domain;


/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
public class MyRequiredClass
{
	private int instanceNumber;


	public MyRequiredClass()
	{
		instanceNumber = InstanceCounter.getNewInstanceNumber();
	}


	@Override
	public String toString()
	{
		return "MyRequiredClass{" +
		       "instanceNumber=" + instanceNumber +
		       '}';
	}


	public static class InstanceCounter
	{
		public static int instanceNumber = 0;


		public static int getNewInstanceNumber()
		{
			return ++instanceNumber;
		}
	}
}
