package zhou.classdemo;

import static java.lang.Math.sqrt;

class Point {
	// Coordinates of the point, 点对象的坐标
	double x;
	double y;

	// Create a point from coordinates，用给定的坐标创建一个点对象
	Point(double xVal, double yVal) {
		x = xVal;
		y = yVal;
	}

	// Create a point from another Point object，复制一个点对象
	Point(final Point oldPoint) {
		x = oldPoint.x; // Copy x coordinate
		y = oldPoint.y; // Copy y coordinate
	}

	// Move a point
	void move(double xDelta, double yDelta) {
		// Parameter values are increments to the current coordinates
		x += xDelta;
		y += yDelta;
	}

	// Calculate the distance to another point，计算这个点与另一个点的距离
	double distance(final Point aPoint) {
		return sqrt((x - aPoint.x) * (x - aPoint.x) + (y - aPoint.y)* (y - aPoint.y));
	}

	// Convert a point to a string
	public String toString() {
		return Double.toString(x) + ", " + y; // As "x, y"
	}
}
