package test;


public class InterfaceDemo1 {

}
class NoteBook1{
	public void run(){
		System.out.println("NoteBook: run");
	}
	class Usb{
		public void open(){System.out.println("open usb");};
		public void close(){System.out.println("close use");};
	}
	class Mouse extends Usb{
		public void open(){
			System.out.println("open usb");
			System.out.println("Mouse open");
		}
		public void close(){
			System.out.println("Mouse close");
			System.out.println("close use");;
		}
	}
	class Key extends Usb{
		public void open(){
			System.out.println("open usb");
			System.out.println("Key open");
		}
		public void close(){
			System.out.println("Key close");
			System.out.println("close use");
		}
	}
	
}
