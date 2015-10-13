class EqualsTester{
	public static void main(String[] args) {
		String str1,str2;
		str1 = "Free the bound preiodicals.";
		str2 = str1;

		System.out.println("String1 :" + str1);
		System.out.println("String2 :" + str2);
		System.out.println("Same Object ?" + (str1 == str2));

		str2 = new String(str1);

		System.out.println("String1 :" + str1);
		System.out.println("String2 :" + str2);
		System.out.println("Same Object ?" + (str1 == str2));
		System.out.println("Same Value ?" + str1.equals(str2));		
	}
}