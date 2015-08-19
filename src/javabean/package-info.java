/**
 * 
 */
/**
 * @author zhou
 * JavaBean
 *
 */
package javabean;
/*
Java面向对象——JavaBean内省 
面向对象

    初识JavaBean与内省

        JavaBean是一种特殊的Java类，主要用于传递数据信息，这种Java类中的方法主要用于访问私有的字段，
        且方法名符合某种命名规则。

    JavaBean的应用情景

        如果要在两个模块之间传递多个信息，可以将这些信息封装到一个JavaBean中，这种JavaBean的实例
        对象通常称之为值对象（Value Object，简称VO）。
        这些信息在类中用私有字段来存储，如果读取或设置这些字段的值，则需要通过一些相应的方法来访问。

    JavaBean的规则

        JavaBean的属性是根据其中的setter和getter方法来确定的，而不是根据其中的成员变量。
        如果方法名为setId，中文意思即为设置id，至于你把它存到哪个变量上，则不用管。如果
        方法名为getId，中文意思即为获取id，至于你从哪个变量上取，也不用管。去掉set前缀，
        剩余部分就是属性名，如果剩余部分的第二个字母是小写的，则把剩余部分的首字母改成小的。

        例如：

            setId()的属性名：id

            isEmpty()的属性名：empty

            setCPU的属性名：CPU

            gettime的属性名：time

        总之，一个类被当作JavaBean使用时，JavaBean的属性是根据方法名推断出来的，它根本看不到
        Java类内部的成员变量。

        一个符合JavaBean特点的类可以当作普通类一样进行使用，但把它当JavaBean用肯定需要带来一些
        额外的好处，我们才会去了解和应用JavaBean！

    JavaBean的好处

        好处如下：

            1、在Java EE开发中，经常要使用到JavaBean。很多环境就要求按JavaBean方式进行操作，
            别人都这么用和要求这么做，那你就没什么挑选的余地！

            2、JDK中提供了对JavaBean进行操作的一些API，这套API就称为内省。如果要你自己去通过
            getX方法来访问私有的x，怎么做，有一定难度吧？用内省这套API操作JavaBean比用普通类
            的方式更方便。

    对JavaBean的简单内省操作

        通过内省的方式对Person对象中的成员变量进行读写操作。

        并对生成的代码进行重构。


        通过反射对某个属性进行读写操作的代码可以抽取为通用方法，通过MyEclipse可以非常轻松实现这个功能。

        步骤如下：选中需要重构的代码，右击-->Refactor-->Extract Method...。

                给抽取后的方法取一个名字，然后点击OK。
 

  
  
  
 */
