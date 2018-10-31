package str;

public class PrT7 {

	public static void main(String[] args) {
		String S="asdfg dgjhjg fgfg g";
		int pos1=0;
		int pos2=0;
		 pos1=S.indexOf(' ');
		 pos2=S.lastIndexOf(' ');
		String S1= S.substring(pos1,pos2);
		System.out.println(S1);
	}

}

