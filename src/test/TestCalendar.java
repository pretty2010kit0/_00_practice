package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 1）根据入职时间和签订年份 计算劳动合同
 * 续签时间：在结束时间的前一个月续签
 * 如果是周末，要提前到周五
 * 2）计算出续签提醒时间，在续签时间前的一周
 * 入职时间是String形式:"2014-4-1"
 * 设计算法：
 * 1）转换String时间到Date   (parse())
 * 2）创建Calendar对象 并修改到入职时间
 * 3）计算到期时间（加 年份）
 * 4）计算提前一个月（减1个月）
 * 5）判断星期：星期日 就-2天 星期六-1天
 * 6）得到续签日
 * 7）减一周（-7天）得到提醒日
 * 8）输出格式化的日期
 * */
public class TestCalendar {
	public static void main(String[] args) throws ParseException {
		String dateIn = "2014-4-1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dateIn);
		Calendar c =  new GregorianCalendar();
		c.setTime(date);
		c.add(Calendar.YEAR, 3);// 3 - > 0
		c.add(Calendar.MONTH, -1);
		System.out.println(sdf.format(c.getTime()));
		switch (c.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SATURDAY:
			c.add(Calendar.DAY_OF_WEEK,-1);
			System.out.println(1);
			break;
		case Calendar.SUNDAY:
			System.out.println(2);
			c.add(Calendar.DAY_OF_WEEK, -2);
			break;
		}
		System.out.println(sdf.format(c.getTime()));
		c.add(Calendar.WEEK_OF_MONTH, -1);
		date = c.getTime();
		System.out.println(sdf.format(date));
	}
}
