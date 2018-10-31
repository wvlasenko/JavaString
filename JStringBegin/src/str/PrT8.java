package str;

public class PrT8 {
	public static void main(String[] args) {
		String S="secret word password";
		String S2=".";
		String S1= S.replace("",".");
		if (S1.substring(S1.length()-1,S1.length()).equals(S2)){
	S1=S1.substring(0, S1.length()-1)+"";
	System.out.println(S1);
		}
	}
}
