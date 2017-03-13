import java.util.Scanner;
public class Decision {

		Scanner user = new Scanner(System.in);
		public Decision()
		{
			brushTeeth();
		}
			
			

		private void brushTeeth()
		{
			System.out.println("Have you brushed your teeth?: ");
			String user1 = user.nextLine();
			
			if (user1.equals("yes"))
			{
				System.out.println("Good!");
				tieShoes();
			} 
			else 
			{
				System.out.println("Go brush your teeth!");
				brushTeeth();
			}
		}
		private void tieShoes()
		{
			System.out.println("Have you tied your shoes?: ");
			String user2 = user.nextLine();
			
			if (user2.equals("yes"))
			{
				System.out.println("Good!");
				jacketOn();
			} 
			
			else 
			{
				System.out.println("Go ties your shoes! ");
				tieShoes();
			}
		}
		private void jacketOn()
		{
			System.out.println("Have you put your jacket on?: ");
			String user3 = user.nextLine();
			
			if (user3.equals("yes"))
			{
				System.out.println("Good!!");
				System.out.println("You are ready for the day!");
			} 
			
			else 
			{
				System.out.println("Go put your jacket on!");
				jacketOn();
			}
		}
}
