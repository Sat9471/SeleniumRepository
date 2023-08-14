package week3.day1;

public class MyPhone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iPhone iph=new iPhone();
		iph.makeCall();
		iph.sendSMS();
		
		//overriding method the output printed the final or latest method
		iph.startApp();
		iph.increaseVolume();
		iph.shutDown();
		//iph.watchMovie();
		

}
}