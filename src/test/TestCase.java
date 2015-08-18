package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class TestCase {
	//@Test
	public void test1(){
		//"画上荷花和尚画"
		//          01234567890
		String s = "abcdefedcba";
		//i=0 j=10  ^         ^
		//i=1 j=9    ^       ^
		//i=2 j=8     ^     ^
		//i=3 j=10-i   ^   ^
		//i=4           ^ ^
		int i;
	  for(i=0; i<s.length()/2; i++){
	  	int j = s.length()-1-i;
	  	if(s.charAt(i)!=s.charAt(j)){
	  		System.out.println("不是回文！");
	  		break;
	  	}
	  }
		if(i==s.length()/2){
			System.out.println("是回文");
		}
	}
	//@Test
	public void testString2(){
		// 0x4e00 ~ 0x9fa5
		int i=0;
		StringBuilder buf = new StringBuilder();
		for(char c = 0x4e00; c<=0x9fa5; c++){
			i++;
			buf.append(c);
			if(i%50==0){
				buf.append('\n');
			}
		}
		String s = buf.toString();
		System.out.println(s); 
	}
	//@Test
	public void testToString(){
		int i = 5020;
		System.out.println(i);
		Integer.parseInt("55");
		System.out.println(Integer.toString(i));
		//输入数据 10 进制字符串 "5012"
		//Java 调用 Integer.parseInt() 转换为2进制
		//输出时候 2进制数据 调用 Integer.toString()
		//转换为10进制字符串, 输出!
	}

	//@Test
	public void testLong(){
		//从1970年元旦, 到现在累计的毫秒数
		long now = System.currentTimeMillis();
		System.out.println(now);
		long year = now/1000/60/60/24/365+1970;
		System.out.println(year); 
		long max = Long.MAX_VALUE;
		year = max/1000/60/60/24/365+1970;
		System.out.println(year); 
	}
	//@Test
	public void testDate(){
		//java.util.Date
		Date date = new Date();//就是当前时间
		System.out.println(date);//toString
		int year = date.getYear()+1900;//获取年份
		System.out.println(year);
		int month = date.getMonth()+1;//计算月份
		System.out.println(month); 
		long time=date.getTime();
		time += 1000L*60*60*24*365;
		date.setTime(time);//-1000L*60*60*24*365*2
		year = date.getYear()+1900;
		System.out.println(year); 
		date.setTime(Long.MAX_VALUE); 
		year = date.getYear()+1900;
		System.out.println(year); 
	}
	//@Test
	public void testDateFormat1(){
		//将当前系统时间, 显示为 年月日时分秒格式
		long now = System.currentTimeMillis();
		//默认fmt按照本的习惯设置日期格式
		SimpleDateFormat fmt=new SimpleDateFormat();
		//将时间now格式化为 文本格式 年月日时分秒
		String date = fmt.format(now);
		//format 格式化, 就是格式转换, 翻译
		System.out.println(date); 
	}
	//@Test
	public void testDateFormat2(){
		Date d = new Date();//当前系统时间
		SimpleDateFormat fmt=
			new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		String date = fmt.format(d);
		System.out.println(date); 
		//SimpleDateFormat: 输出时间给"人"看的时候
	}
	//@Test
	public void testDateParse()throws Exception{
		//如何将 "1990-4-1" 转换为 Java的时间
		String dateStr = "1990-4-1";// "14:58:30"
		SimpleDateFormat fmt = 
			new SimpleDateFormat("yyyy-M-d");
		Date d = fmt.parse(dateStr);
		System.out.println(d); 
		System.out.println(d.getTime()); 
		//parse: 什么时候使用?
		//处理人类输入的时间数据转换为Java的系统时间
	}
	@Test
	public void testCalendar1(){
		//创建日历对象
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		System.out.println(c1.getClass().getName());
		System.out.println(c2.getClass().getName());
		//可以转换calendar到Date类型时间
		Date d = c1.getTime();//将c1转换到Date类型d
		//也可以使用c1.setTime(d)设置c1的时间
		Calendar c3 = new GregorianCalendar(
				2014, Calendar.APRIL, 1);//2014-4-1
		//可以将Calendar转换为Date类型再进行格式化输出
		SimpleDateFormat fmt=new SimpleDateFormat();
		d = c3.getTime();
		System.out.println(fmt.format(d)); 
	}
	@Test
	public void testCalendar2(){
	//计算 2014-4-1 是星期几?
	//计算 2014-6-1 是星期几?
	
		Calendar c = Calendar.getInstance();
		//Calendar 的时间设置要从大到小顺序处理!
		c.set(Calendar.YEAR, 2014);
		c.set(Calendar.MONTH, Calendar.APRIL);
		c.set(Calendar.DATE, 1);
		//c.set(Calendar.DAY_OF_MONTH, 1);
		int w = c.get(Calendar.DAY_OF_WEEK);
		//注意星期第一天是星期日值是1
		System.out.println(w-1);//TUESDAY的值是3
		if(c.get(Calendar.DAY_OF_WEEK)
				==Calendar.TUESDAY){
			System.out.println("这是星期二");
		}
	}
	@Test
	public void testCalendar4(){
	//计算 最大值的那一天 是星期几?
		long max = Long.MAX_VALUE;
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(max);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		int w = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(w); 
	}
	@Test
	public void testAdd(){
		Calendar c = new GregorianCalendar();
		c.add(Calendar.YEAR, 1);//时间分量计算
		//时间分量加法
		c.add(Calendar.MONTH, -3);//时间分量减法
		SimpleDateFormat fmt=new SimpleDateFormat();
		System.out.println(fmt.format(c.getTime()));  
	}
	@Test
	public void testCalendar()throws Exception{
		//1 根据入职时间和签订年份 计算 劳动合同
		//  续签时间: 在结束时间的前一个月续签
		//  如果是周末, 要提前到周五
		//2 计算出 续签提醒时间, 在续签时间前的一周
		// 入职时间是 String的格式: "2014-4-1" 
		//设计算法
		// 1) 转换String时间到Date  (parse())
		// 2) 创建Calendar对象 并修改到入职时间
		// 3) 计算到期时间(加 年份)
		// 4) 计算提前一个月(减 1个月)
		// 5) 判断星期: 星期日就-2天  星期六减-1天
		// 6) 得到续签日
		// 7) 减一周(-7天)得到提醒日
		// 8) 输出格式化的日期
		String date = "2014-4-1";//入职时间
		int years = 3;//签订年份
		SimpleDateFormat fmt = 
			new SimpleDateFormat("yyyy-MM-dd");
		Date d = fmt.parse(date);//入职时间
		Calendar c = new GregorianCalendar();
		c.setTime(d);//将c改为入职时间
		c.add(Calendar.YEAR, years);//合同到期时间
		c.add(Calendar.MONTH, -1);//减1个月
		//获取星期
		int day = c.get(Calendar.DAY_OF_WEEK);
		if(day==Calendar.SUNDAY){//周日减2天
			c.add(Calendar.DAY_OF_MONTH, -2);
		}else if(day==Calendar.SATURDAY){
			c.add(Calendar.DATE, -1);//周六减1天
		}
		Date singDate = c.getTime();
		System.out.println(fmt.format(singDate));
		//提前一周, 作为提醒日
		c.add(Calendar.WEEK_OF_MONTH, -1);
		Date waring = c.getTime();
		System.out.println(fmt.format(waring));
	}
	@Test
	public void testCalendar5(){
		Calendar c = Calendar.getInstance();
		//获取当前时间(当前月份)的最大天数
		int maxDays = 
			c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDays); 
	}
	
}































