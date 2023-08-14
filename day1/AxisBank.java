package week3.day1;

//need to extends AxisBank from BankInfo
public class AxisBank extends BankInfo {

//	Class     :AxisBank
//  Methods :deposit()
	public void deposit() {
		System.out.println("Customer's deposit in the AxisBank account");
	}
	
//	Description:
//		You have to override the method deposit in AxisBank.	
	public static void main(String[] args) {
		AxisBank axb=new AxisBank();
		axb.saving();
		axb.fixed();
		axb.deposit();
	}
}
