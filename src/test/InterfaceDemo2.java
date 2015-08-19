package test;

/**耦合度：指模块之间联系的紧密程度.
 * 模块间的耦合度是指模块之间的依赖关系，包括控制关系，调用关系，数据传递关系。
 * 模块间联系越多，其耦合性越强，同时表明其独立性越差。降低模块间的耦合度，可以
 * 减小对某一模块修改所引起的“牵一发动全身”的水波效应，提高系统的可维护性。
 * 
 * 内聚度：指内部元素之间联系的紧密程度0
 * 
 * */
public class InterfaceDemo2 {
	public static void main(String[] args) {
		NoteBook2 nb = new NoteBook2();
		nb.run();
		nb.useusb(new Mouse());
		nb.useusb(new Key());
	}
}

class NoteBook2{
	public void run(){
		System.out.println("NoteBook: run");
	}
	public void useusb(Usb usb){
		if(usb!=null){
			usb.open();
			usb.close();
		}
	}
	
}
interface Usb{
	public void open();
	public void close();
	
}
class Mouse implements Usb{
	public void open(){
		System.out.println("Mouse open");
	}
	public void close(){
		System.out.println("Mouse close");
	}
}
class Key	implements Usb{
	public void open(){
		System.out.println("Key open");
	}
	public void close(){
		System.out.println("Key close");
	}
}

