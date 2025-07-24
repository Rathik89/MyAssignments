package week3.day1;


public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String-->collection of characters declaration:1)string literal 2)string
		 * instantiation
		 */

		// syntax:Datatype var.name="values"--->string literal

		String name = "Testleaf";
		String name1 = "testLeaf";
		// string instantiation
				String str = new String("Testleaf");
				String str1 = new String("Testleaf");

		// count the number of characters
				int length = name1.length();
				System.out.println(length);

		// compare two strings(equals)----content of the string and also it is case
		// sensitive
				boolean equals = str.equals(name1);
				System.out.println(equals);
				if (str.equals(name1)) {
					System.out.println("Checking string by using EQUALS KEY-  values are same");
		
				} else {
					System.out.println("Checking string by using EQUALS KEY - values are not same");
		
				}

		// ==--->check for the memory location
				if (str == name) {
					System.out.println("Checking string by using DOUBLE EQUALS SYMBOL -content is same");
		
				} else {
					System.out.println("Checking string by using DOUBLE EQUALS SYMBOL - content is not same");
		
				}
		
		
		// ignore case sensitive---->content alone
				boolean equalsIgnoreCase = str.equalsIgnoreCase(name1);
				System.out.println("Checking string by using case sensitive KEY -" + equalsIgnoreCase);
		
		// contains--->content-->case sensitive and not checks the memory location
				if (str.contains(name1)) {
					System.out.println("Checking string by using CONTAINS - same");
		
				} else {
					System.out.println("Checking string by using CONTAINS - not same");
		
				}
			
		//to charArray
				char[] charArray = name.toCharArray();
				System.out.println("Convert the string to array" + charArray );
				for (int i = 0; i < charArray.length; i++) {
					System.out.println(charArray[i]);
					
				}
			
		//charAt--->retrieve a particular value
				char charAt = str.charAt(5);
				System.out.println("value present in the index at 5 is:"+charAt);
				
		//replace
				String s="testleaf@321";
				
				String replace = s.replace("t", "");
				System.out.println(replace);
		//retrieve any values
				String replaceAll = s.replaceAll("[^0-9]", "");
				System.out.println("numbers retrived are:"+replaceAll);
				String replaceAll2 = s.replaceAll("[^a-z]", "*");
				System.out.println("alphabets retreived:"+replaceAll2);
				
		//string to integer
				String st="12";
				System.out.println(st+10);
				int stringTOInt = Integer.parseInt(st);
				System.out.println(stringTOInt+10);
		//integer to string
				int i=32;
				System.out.println(i+10);
				String intToString = Integer.toString(i);
				System.out.println(intToString+10);
				
		//split--->split the given string to multiple strings
				String st1="Testleaf and Qeagle";
				/*
				 * String[] split = st1.split("le"); System.out.println(split[2]); String[]
				 * split2 = st1.split(" "); System.out.println(split2[3]);
				 */
				String[] split3 = st1.split("");
				System.out.println("Separted by space : "+ split3[5]);
				String[] split4 = st1.split("st");
				System.out.println("Separted by st word : "+ split4[1]);
				
		//substring
				String ss="june";
				String substring = ss.substring(1);
				System.out.println(substring);
				String substring2 = ss.substring(1, 2);
				System.out.println(substring2 );
		
	}

}

