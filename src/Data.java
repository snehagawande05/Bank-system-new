import java.util.Scanner;
public class Data {

	public static void main(String[] args) {
       
		Scanner sc =new Scanner(System.in);
		String firstname, lastname , mothername ,address ,actype ,uname ,pword ;
		int choice;
		
		System.out.println("...CREATE ACCOUNT...");
		System.out.println("First Name :");
		firstname=sc.next();
		
		System.out.println("ok..");
		System.out.println("Last Name :");
		lastname=sc.next();
		
		System.out.println("ok...");
        System.out.println("Mother namae :");
        mothername=sc.next();
        
        System.out.println("ok...");
        System.out.println("Address");
        address=sc.next();
        
        System.out.println("...Select Account Type...");
        System.out.println("1.Saving Account");
        System.out.println("2.Current Account");
        System.out.println("0.Back to the menu");
        System.out.println("Enter your choice");
        choice=Integer.parseInt(sc.nextLine());
        
        switch (choice) {
		case 1:
			System.out.println("Saving Account");
			actype="saving";
			break;
			
		case 2:
			System.out.println("Current Account");
			actype="current";
			break;
		case 0:
			System.out.println("Back to the menu");

		default:
			System.out.println("INVALID CHOICE");
			break;
		}
	}

}
