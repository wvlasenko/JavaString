package str;

public class PrT3 {

	public static void main(String[] args) {
		String s[]= {"let","be","light"};
		int maxlength=0;
		int maxindex=0;
		String s1="";
		for (int i=0;i<s.length;i++) {
			if (s[i].length()>maxlength) {
				maxlength =	s[i].length();
				maxindex=i;
			}
		}
s1=s[maxindex];
System.out.println(s1);
for (int i = 0;i<maxlength-1;i++) {
	if(i==maxindex) {
		continue;}
	s1 = s1 + " " + s[i];
	}
System.out.println(s1);
}
	}


