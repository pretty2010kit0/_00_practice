<<<<<<< HEAD
// 成员内部类使用测试

package com.learnjava.innerclass;

class MemberInner
{
    private int d = 1;
    private int a = 2;

    // 定义一个成员内部类
    public class Inner2
    {
        private int a = 8;

        public void doSomething()
        {
            // 直接访问外部类对象
            System.out.println(d);
            System.out.println(a);// 直接访问a，则访问的是内部类里的a

            // 如何访问到外部类里的a呢？
            System.out.println(MemberInner.this.a);
        }

    }

}

public class MemberInnerClassTest
{

    public static void main(String[] args)
    {

        // 创建成员内部类的对象
        // 需要先创建外部类的实例
        MemberInner.Inner2 inner = new MemberInner().new Inner2();

        inner.doSomething();
    }
=======
// 成员内部类使用测试

package com.learnjava.innerclass;

class MemberInner
{
    private int d = 1;
    private int a = 2;

    // 定义一个成员内部类
    public class Inner2
    {
        private int a = 8;

        public void doSomething()
        {
            // 直接访问外部类对象
            System.out.println(d);
            System.out.println(a);// 直接访问a，则访问的是内部类里的a

            // 如何访问到外部类里的a呢？
            System.out.println(MemberInner.this.a);
        }

    }

}

public class MemberInnerClassTest
{

    public static void main(String[] args)
    {

        // 创建成员内部类的对象
        // 需要先创建外部类的实例
        MemberInner.Inner2 inner = new MemberInner().new Inner2();

        inner.doSomething();
    }
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
}