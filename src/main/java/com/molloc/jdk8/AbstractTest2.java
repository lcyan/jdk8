package com.molloc.jdk8;

/**
 * @author yanleichang
 */
public class AbstractTest2 extends AbstractTest {

    private void myTest(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        AbstractTest2 test2 = new AbstractTest2();
        //1、通过匿名内部类
        test2.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("mytest");
            }
        });

        printLine();
        //2、使用lambda表达式
        test2.myTest(() -> System.out.println("mylambda"));

        printLine();

        MyInterface myInterface = () -> System.out.println("hello");
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}
