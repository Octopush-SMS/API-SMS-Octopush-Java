package octopushSms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		SmsObject sms = new SmsObject();
		int i;
		do {
			System.out.println("Press 1 to get balance ");
			System.out.println("Press 2 to send SMS ");
			System.out.println("Press 0 to exit ");
			i = in.nextInt();
			if (i == 1) 
				System.out.println( sms.getBalance()+"\n");
			else if (i == 2) 
				System.out.println(sms.sendSms()+"\n");
			else if (i == 0) 
				break;
			else
				System.out.println("Enter only number 1/2/3");
		} while (i != 0);
		in.close();
	}
}
