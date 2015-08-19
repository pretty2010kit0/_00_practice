package javabean;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class IntroSpector {


    public static void main(String[] args)throws Exception {

        Person p = new Person();

        setProperty(p, "age", 21);

        Object obj = getProperty(p,"age");

        System.out.println(obj);
        
        System.out.println(obj.getClass());
        
        setProperty(p, "name", "zhou");
        
         obj = getProperty(p,"name");
        
        System.out.println(obj);
        
        System.out.println(obj.getClass());

    }
    /**
     * 注意：抽取方法之后，为了使抽取后的方法具备通用性，一定要把方法中某些参数设置为Object类型。
     * 对JavaBean的复杂内省操作
     * */
    private static Object getProperty(Object obj,String propertyName) throws Exception {

        PropertyDescriptor pd =new PropertyDescriptor(propertyName,obj.getClass());

        Method methodGetAge = pd.getReadMethod();

        Object retVal = methodGetAge.invoke(obj);

        return retVal;

    }

    private static void setProperty(Object obj,String propertyName,int value) throws Exception{

        PropertyDescriptor pd =new PropertyDescriptor(propertyName,obj.getClass());

        Method methodSetAge = pd.getWriteMethod();

        methodSetAge.invoke(obj, value);

    }
    
    private static void setProperty(Object obj,String propertyName,String value) throws Exception{

        PropertyDescriptor pd =new PropertyDescriptor(propertyName,obj.getClass());

        Method methodSetAge = pd.getWriteMethod();

        methodSetAge.invoke(obj, value);

    }

}
