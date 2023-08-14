package week3.day1;

//Automation class inherits MultipleLanguage abstract class(unimplemented methods only) then it implements Language interface and TestTool interface
public class AutomationClass extends MultipleLanguage implements Language, TestTool { 

	//Execution class: Automation 
	//Implement all the methods of interface and abstract class in Automation class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		
	}

	@Override
	//right click then click source after that click on implement/override then click the method(python)
	//It creates a subclass super.python(); with object(instance) name super
	public void python() {
		// TODO Auto-generated method stub
		super.python();
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	}

}
