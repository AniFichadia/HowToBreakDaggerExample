package com.aniruddhfichadia.mydaggerexample;

import com.aniruddhfichadia.mydaggerexample.domain.MyInjectedIntoClass;
import com.aniruddhfichadia.mydaggerexample.domain.MyOtherInjectedIntoClass;

import org.junit.Test;

/**
 * @author Aniruddh Fichadia | Email: Ani.Fichadia@gmail.com | GitHub Username: AniFichadia
 *         (http://github.com/AniFichadia)
 */
public class MyDaggerExampleTest {
    @Test
    public void test() {
        MyInjectedIntoClass m1 = new MyInjectedIntoClass();
        m1.doSomething();

        System.out.println();

        MyOtherInjectedIntoClass m2 = new MyOtherInjectedIntoClass();
        m2.doSomething();
    }
}