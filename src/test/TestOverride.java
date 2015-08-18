package test;

public class TestOverride {
    public static void main(String[] args) {
        Ostrich os = new Ostrich();
        os.fly();
    }
    /**
     * 方法的重写要遵循"两同两小一大"规则.
     * 两同：方法名相同，形参列表相同
     * 两小：子类方法返回值类型应比父类方法返回值类型更小或相等，
     *      子类方法声明抛出的异常应比父类方法声明抛出的异常类更小
     *      或相等。
     * 一大：子类方法的访问权限应比父类方法更大或相等。
     * 
     * 尤其需要指出的是，覆盖方法和被覆盖方法要么都是类方法，要么
     * 都是实例方法，不能一个是类方法，一个是实例方法。(即不能一个
     * 由static修饰，一个没有static)
     * */
}
class Bird{
    public void fly(){
        System.out.println("我在天空自由自在的飞翔……");
    }
}
class Ostrich extends Bird{
    public void fly(){
        System.out.println("我只能在地上奔跑……");
    }
}
