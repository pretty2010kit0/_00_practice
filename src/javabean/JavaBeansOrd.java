package javabean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class JavaBeansOrd {

    public static void main(String[] args) throws Exception {

    	Person p = new Person();
    	
    	p.setName("zhou");
    	p.setAge(15);

        Object name = getPropertyTo(p,"name");
        Object age = getPropertyTo(p,"age");

        System.out.println(name);
        System.out.println(age);

    }

    /**
     * 采用遍历BeanInfo的所有属性方式来查找和设置某个对象的属性。
     * 在程序中把一个类当作JavaBean来看，就是调用IntroSpector.getBeanInfo方法，
     * 得到的BeanInfo对象封装了把这个类当作JavaBean看的结果信息。
     * */
    private static Object getPropertyTo(Object obj,String propertyName) throws Exception {

        PropertyDescriptor pd =new PropertyDescriptor(propertyName,obj.getClass());

        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());

        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

        Object retVal = null;

        for (PropertyDescriptor p : pds) {

            if(pd.getName().equals(propertyName)) {

                Method methodGetAge = pd.getReadMethod();

                retVal = methodGetAge.invoke(obj);

                break;

            }

        }

        return retVal;

    }


}
