package seleniumpracticeJ;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class DuplicateString {
public static void main(String[] args) {
		String str = 
	           "big black bug bit a big black dog on his big black nose";
	        System.out.println("Original String: ");
	        System.out.println(str);
	        String[] strWords = str.split("\\s+");
	        LinkedHashSet<String> lhSetWords 
	            = new LinkedHashSet<String>( Arrays.asList(strWords) );
	        StringBuilder sbTemp = new StringBuilder();
	        int index = 0;
	        for(String s : lhSetWords){
	            if(index > 0)
	                sbTemp.append(" ");
	            sbTemp.append(s);
	            index++;
	        }
	        str = sbTemp.toString();
	        System.out.println("String after removing duplicate words: ");
	        System.out.println(str);
	    }

}