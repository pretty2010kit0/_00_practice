package zhou.classdemo;

// Sphere 球体
class Sphere {
	static final double PI = 3.14; // Class variable that has a fixed value
	static int count = 0; // Class variable to count objects

	// Instance variables
	double radius; // Radius of a sphere

	double xCenter; // 3D coordinates
	double yCenter; // of the center
	double zCenter; // of a sphere

	// 添加默认的无参构造函数
	Sphere() {
		// xCenter,yCenter,zCenter默认值都是0.0
		radius = 1.0;
		count++;
	}

	// Class constructor
	Sphere(double theRadius, double x, double y, double z) {
		radius = theRadius; // Set the radius 设置半径

		// Set the coordinates of the center
		xCenter = x;
		yCenter = y;
		zCenter = z;
		++count; // Update object count
	}
	
	// 使用构造函数复制对象
	Sphere(final Sphere oldSphere){
		radius = oldSphere.radius;
		xCenter = oldSphere.xCenter;
		yCenter = oldSphere.yCenter;
		zCenter = oldSphere.zCenter;
		count++;
	}

	// Static method to report the number of objects created
	static int getCount() {
		return count; // Return current object count
	}

	// Instance method to calculate volume
	double volume() {
		/*
		 * 每个实例方法都有一个名为this的变量，它指向调用方法的当前对象。 当方法引用类的一个实例变量时，编译器隐式地使用this。
		 * 例如，当方法volume()指向实例变量radius时，编译器就会插入 this对象引用以便这个引用等同于 this.radius。
		 */
		return 4.0 / 3.0 * PI * radius * radius * radius;
		// return 4.0/3.0*PI*this.radius*this.radius*this.radius;
	}

	void changeRadius(double radius) {
		// change the instance variable to the argument value
		this.radius = radius;
		/*
		 * this.radius 指向实例变量，没有this则指向参数radius radius 指向参数
		 */
	}
}
