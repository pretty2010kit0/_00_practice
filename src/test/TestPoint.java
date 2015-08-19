package test;

import java.util.HashSet;
import java.util.Set;

public class TestPoint extends Object{
	public static void main(String[] args) {
		HashSet<Point> set = new HashSet<Point>();
		Point p1 = new Point(10, 20);
		Point p2 = new Point(30, 40);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		/*根据哈希值存放在相应的位置
		 * p1 p2 是根据目前的x,y算出的哈希值
		 * 存储进set后，位置不在改变。*/
		p1.x=15;//修改了属性x的值，但不再重新算值
		System.out.println(set.add(p1));
		System.out.println(set.add(p2));
		System.out.println(p1);
		System.out.println(p2);
		p2.x=35;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(set.remove(p1));//根据新的x，y算哈希值找不到原来的p1.
		set.add(new Point(30, 40));//此处算出的哈希值与p2一样，但equals比较不同。
		set.add(new Point(35, 40));//与p2的equals相同，但是算出的哈希值不同。
		System.out.println(set.size());
		System.out.println(set);
	}
}
class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
//	@Override
//	public String toString() {
//		return "("+ x + "," + y + ")";
//	}
	
}
