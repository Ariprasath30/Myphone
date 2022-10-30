package org.phone;

public class PhoneInfo {
	public void phoneName()
	{
		System .out.println("phone name;pocof4");
	}
	public void phoneMienum()
	{
		System .out.println("phone mieinum;10000");
	}
	public void Camera()
	{
		System .out.println("camera;16mp");
	}
	public void Storage()
	{
		System .out.println("Storage;64gb");
	}

	public void osName()
	{
		System .out.println("osName;anroid 11");
	}
	public void phNo()
	{
		System .out.println("PhNO;9659596764");
	}
	public void phram()
	{
		System .out.println("Phram;2gb");
	}
	//main method creation
	//main ctrl+space and press enter
	public static void main(String[]args) {
		//object creation
		//classname bojectname = new classname();
		PhoneInfo p = new PhoneInfo();
		//method calling
		//objectname . methodname();
		p.phoneName();
		p.phoneMienum();
		p.Camera();
		p.Storage();
		p.osName();
		p.phNo();
				
		
	}
}
