public class TEST1_tonatnjtaknjawe{
    public static void test() {

        LLString llstr = new LLString("Programmingram");
        System.out.println(llstr.charAt(2));
        System.out.println(llstr.length());
        System.out.println(llstr.toString());

        LLString llstr2 = new LLString("Programming1");
        LLString llstr3 = new LLString("gram");
        LLString llstr4 = new LLString("Programaing");
        LLString llstr5 = new LLString("proGRamaing");

        System.out.println(llstr.replace('m', 'z'));
        System.out.println(llstr.substring(3));
        System.out.println(llstr.substring(5, 10));
        System.out.println(llstr.substring(5, 10).length());
        System.out.println(llstr.indexOf((int)'m'));


		System.out.println(llstr.indexOf('m'));
		System.out.println(llstr.indexOf('m', 10));
		System.out.println(llstr.indexOf(llstr3.toString(), 4));
		System.out.println(llstr.indexOf(llstr3.toString(), 3));
		System.out.println(llstr);

		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareTo(llstr2)));
		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareTo(llstr3)));
		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareTo(llstr4.toString())));
		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareTo(llstr5.toString())));
		System.out.println();

		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareToIgnoreCase(llstr2)));
		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareToIgnoreCase(llstr3)));
		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareToIgnoreCase(llstr4.toString())));
		System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareToIgnoreCase(llstr5.toString())));

    }

    static int NORM(int a) {
        if(a > 0)
            return 1;
        else if(a == 0)
            return 0;
        else
            return -1;
    }
}
