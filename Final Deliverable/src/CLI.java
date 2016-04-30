import java.util.Scanner;

public class CLI {
	
	
	static String prompt = "please input> ";
	

	  public static void main(String[] args) throws InterruptedException {
		  
		  Register myregister = Register.getInstance();
		  
		  splashScreen(); 
		  Scanner scanner = new Scanner(System.in).useDelimiter("/n");
		  String[] userCommand;
		  do {  // do-while !exit
				System.out.print(prompt);
				userCommand = scanner.nextLine().split(" ");

				/*
				 *  This switch handles a very dsmall list of commands of known syntax.
				 *  You will probably want to write a parse(userCommand) method to
				 *  to interpret more complex commands. 
				 */
				switch (userCommand[0]) {
					case "swipe":
						
						String card=userCommand[1];
						int expdate=Integer.valueOf(userCommand[2]);
						myregister.swipeCard(card, expdate);
						System.out.println("input:select Credit");
						break;
					case "select":
						String type=userCommand[1];
						 myregister.selectCardType(type);	
						 System.out.println("input:code 75080");
						break;
					case "code":
						int code=Integer.valueOf(userCommand[1]);
						myregister.enterZipCode(code);
						System.out.println("input:fuel 87");
						break;
					case "fuel":
						int grade=Integer.valueOf(userCommand[1]);
						myregister.selectFuelGrade(grade);
						System.out.println("input:start");
						break;
					case "start":
						System.out.println("start pumping");
						int timeInterval=Integer.valueOf(userCommand[1]);
						myregister.startPumping(timeInterval*100);
				
						System.out.println("input: retun");
						break;
					case "stop":
						System.out.println("stop pumping");
						myregister.stopPumping();
						break;
					case "inventory":
						System.out.println("check inventory");
						Fuel87.getInstance().getInventory();
						break;
					case "return":
						
						System.out.println("return nozzle");
						 myregister.returnNozzle();
						break;
					default:
						System.out.println("I didn't understand the command: \"" + userCommand + "\"");
				}
			} while(!userCommand.equals("exit"));
			System.out.println("Exiting...");
		  
		  
	  }
	
		public static void splashScreen() {
			System.out.println(line("*",80));
	        System.out.println("Welcome to UTD Gas Station"); // Display the string.
			System.out.println("Swip your card please...");
			System.out.println("input: swipe 1234567890 20180808");
			System.out.println(line("*",80));
		}
		
		public static String line(String s,int num) {
			String a = "";
			for(int i=0;i<num;i++) {
				a += s;
			}
			return a;
		}
	
}
