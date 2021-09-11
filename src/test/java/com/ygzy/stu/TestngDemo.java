package com.ygzy.stu;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @description:
 * @Author: Derrick
 * @Date: 2021/9/9 4:30 PM
 */
public class TestngDemo {
    @Test
    public void testngDemo(){
        System.out.println("My name is Derrick");
    }

    @Parameters({"userName","password"})
    @Test
    public void getParam(String username,String password){
        System.out.println("username = " + username + ",password = " + password);
    }

    @Parameters("userName")
    @Test
    public void getParam(String username){
        System.out.println("userName = " + username);
    }

    @Parameters({"pwd"})
    @Test
    public void getParams(@Optional("I'm Derrick")String password){
        System.out.println("pwd = " + password);
    }

    @DataProvider(name = "first")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1,2,3},{7,8,9},{4,5,6}
        };
    }

    @Test(dataProvider = "first")
    public void getDataProvider(int first,int second,int third){
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
    }

}
