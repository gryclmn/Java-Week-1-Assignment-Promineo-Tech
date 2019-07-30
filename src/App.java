import java.text.NumberFormat;
import java.time.Year;
import java.util.Locale;

public class App {

	public static void main(String[] args) {

		double priceOfSilk = 3.49;
		double priceOfPineapple = 4.30;
		
		double hisStartingWalletBalance = 20.00;
		double herStartingWalletBalance = 557503.07;
		
		double hisEndingWalletBalance = hisStartingWalletBalance - priceOfSilk;
		double herEndingWalletBalance = herStartingWalletBalance - priceOfPineapple;
		
		int hisNumOfFriends = 100;
		int herNumOfFriends = 3000;
		
		int hisAge = Year.now().getValue() - 1985; 
		int herAge = Year.now().getValue() - 1985; 
		
		double hisAvgFriendsPerYear = hisNumOfFriends / hisAge;
		double herAvgFriendsPerYear = herNumOfFriends / herAge;
		
		String hisFirstName = "Tom";
		char hisMiddleInitial = 'K';
		String hisLastName = "Cook";
		String hisFullName = hisFirstName + " " + hisMiddleInitial + ". " + hisLastName;
		
		String herFirstName = "Jessica";
		char herMiddleInitial = 'J';
		String herLastName = "Cook";
		String herFullName = herFirstName + " " + herMiddleInitial + ". " + herLastName;

		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

		// Print his info
		System.out.println(hisFirstName + "'s wallet decreased from " + nf.format(hisStartingWalletBalance) +
				" to " + nf.format(hisEndingWalletBalance) + " after purchasing 1 Silk carton for " +
				nf.format(priceOfSilk) + ".");

		System.out.println("Sadly, because" + hisFullName + " had so little money, the " + hisAge +
				" year old only had " + hisNumOfFriends + " friends, which meant he gained " +
				hisAvgFriendsPerYear + " friends per year. Thankfully they were sincere friends.");

		System.out.println();

		// Print her info
		System.out.println(herFirstName + "'s wallet decreased from " + nf.format(herStartingWalletBalance) +
				" to " + nf.format(herEndingWalletBalance) + " after purchasing 1 pineapple for " +
				nf.format(priceOfPineapple) + ".");

		System.out.println("Sadly, because " + herFullName + " had so much money, the " + herAge +
				" year old had a whopping " + herNumOfFriends + " friends, which meant she gained " +
				herAvgFriendsPerYear + " friends per year. Unfortunately they were not very sincere friends.");


	}

}
