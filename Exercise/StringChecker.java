class StringChecker{
	public static void main(String[] args) {

		String str ="Nobody ever went broken by buying IBM";

		System.out.println("The String is :" + str);
		System.out.println("Length Of Thid String :" + str.length());
		System.out.println("The character at position 5:" + str.charAt(5));
		System.out.println("The substring from 26 to  32 :" + str.substring(26,32));
		System.out.println("The index of the character 'v' :" + str.indexOf('v'));
		System.out.println("The index of the substring \" IBM \" :" + str.indexOf("IBM"));
		System.out.println("The String in upper case:" + str.toUpperCase());
	}
}