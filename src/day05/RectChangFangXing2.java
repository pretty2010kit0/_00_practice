package day05;

public class RectChangFangXing2 {

	/**
	 * 3 移方块游戏——添加Rect重载的构造方法
		3.1 问题
		创建矩形实现和初始化矩形对象属性的代码过于复杂庸长:
	 Rect r1 = new Rect();
    r1.x = 100;
    r1.y = 200;
    r1.width = 200;
    r1.height = 200;
    Rect r2 = new Rect();
    r2.x = 100;
    r2.y = 200;
    r2.width = 200;
    r2.height = 200;

要提供更加便捷的创建对象实例的方法.并且要提供多种便捷的创建方式方法.
3.2 方案

提供更加便捷的创建矩形类的构造方法, 简化矩形对象的创建过程, 利用重载的构造器方便构建方式.
3.3 实现

重构Rect类增构造器, 用于创建并初始化对象, 构造器的名字要与类名一致(包括大小写也是一致的), 构造器不能声明返回值, 构造器中的语句用于初始化对象的属性值:

        public Rect(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

重构TestRect类 增加构造器测试方法, 调用构造器初始化并创建对象:

        public static void testRectConstructor() {
            Rect r1 = new Rect(100, 200, 50, 60);
            System.out.println(r1);
    }

在main方法中调用测试方法, 测试对象的创建:

        public static void main(String[] args) {
            testRectConstructor();
        }

测试结果如下, 说明构造器能够创建位置在(100, 200)大小是50X60的矩形:

    x=100, y=200, width= 50, height=60
	 */
	  	 int x;
	    int y;
	    int width;
	    int height;
	    public RectChangFangXing2(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }
	    public void setLocation(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    public void setSize(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }
	    public String toString() {
	        return "x=" + x + ", y=" + y + ", width= " + width + ", height="
	                + height;
	    }

}

