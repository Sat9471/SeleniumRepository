package week3.day1;

//Here Desktop inherits computer for that we use the keyword extends
public class Desktop extends Computer{
	
//	Class        :Desktop
//  Methods   :desktopSize()

	public void desktopSize() {
    System.out.println("Size of the Desktop");
	}
    
//	Description:
//	create above 2 class and call all your class methods into the Desktop using single inheritance.
	
	//type main then ctrl+space
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.desktopSize();
		desk.computerModel();
	}
	
}
