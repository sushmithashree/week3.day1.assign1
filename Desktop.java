package org.system;

public class Desktop {
	public void desktopSize() {
		System.out.println("Desktop size is: 30inches");
	}
	public static void main(String[]args) {
		Computer comp = new Computer();
		comp.computerModel();
		Desktop size = new Desktop();
		size.desktopSize();
	}
}
