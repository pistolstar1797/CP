public class TEST3_tonatnjtaknjawe {
    public static void test() {

        LLString llstr = new LLString("twnaotiasgn69");
        LLString llstr2 = new LLString("twnaotiasgn69");
        LLString llstr3 = new LLString("twnaotIasgn69");
        LLString llstr4 = llstr.concat("asdf").concat("aa");
        LLString llstr5 = new LLString("twnaotjasgn");
        LLString llstr6 = new LLString("twnaotjAbgn");

        System.out.println(llstr.length());
        System.out.println(llstr2.length());
        System.out.println(llstr3.length());
        System.out.println(llstr4.length());
        System.out.println(llstr5.length());
        System.out.println(llstr6.length());

        System.out.println(llstr.compareTo(llstr));
        System.out.println(llstr.compareTo(llstr2));
        System.out.println(llstr.compareTo(llstr3));
        System.out.println(llstr.compareTo(llstr4));
        System.out.println(llstr.compareTo(llstr5));
        System.out.println(llstr.compareTo(llstr6));

        System.out.println(llstr.compareTo(llstr.toString()));
        System.out.println(llstr.compareTo(llstr2.toString()));
        System.out.println(llstr.compareTo(llstr3.toString()));
        System.out.println(llstr.compareTo(llstr4.toString()));
        System.out.println(llstr.compareTo(llstr5.toString()));
        System.out.println(llstr.compareTo(llstr6.toString()));

        System.out.println(llstr.compareToIgnoreCase(llstr.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr2.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr3.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr4.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr5.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr6.toString()));

        llstr.concat(llstr2);
        llstr2 = llstr.concat(llstr2);
        System.out.println(llstr2.indexOf('s'));
        System.out.println(llstr2.indexOf((int)'s'));
        System.out.println(llstr2.indexOf((int)'s', 5));
        System.out.println(llstr2.indexOf("s"));
        System.out.println(llstr2.indexOf("s", 10));
        System.out.println(llstr2.indexOf("asg"));
        System.out.println(llstr2.indexOf("9tw", 10));
        System.out.println(llstr2.length());

        llstr2.replace('s', 'a');
        System.out.println(llstr2.indexOf('s'));
        System.out.println(llstr2.indexOf((int)'s'));
        System.out.println(llstr2.indexOf((int)'s', 5));
        System.out.println(llstr2.indexOf("s"));
        System.out.println(llstr2.indexOf("s", 10));
        System.out.println(llstr2.indexOf("asg"));
        System.out.println(llstr2.indexOf("9tw", 10));
        System.out.println(llstr2.length());

        llstr2 = llstr3.substring(3);
        llstr4 = llstr2.substring(3,6).substring(0);
        llstr = llstr6.substring(1, llstr3.length() - 10).substring(0);


        System.out.println(llstr.length());
        System.out.println(llstr2.length());
        System.out.println(llstr3.length());
        System.out.println(llstr4.length());
        System.out.println(llstr5.length());
        System.out.println(llstr6.length());

        System.out.println(llstr.compareTo(llstr));
        System.out.println(llstr.compareTo(llstr2));
        System.out.println(llstr.compareTo(llstr3));
        System.out.println(llstr.compareTo(llstr4));
        System.out.println(llstr.compareTo(llstr5));
        System.out.println(llstr.compareTo(llstr6));

        System.out.println(llstr.compareTo(llstr.toString()));
        System.out.println(llstr.compareTo(llstr2.toString()));
        System.out.println(llstr.compareTo(llstr3.toString()));
        System.out.println(llstr.compareTo(llstr4.toString()));
        System.out.println(llstr.compareTo(llstr5.toString()));
        System.out.println(llstr.compareTo(llstr6.toString()));

        System.out.println(llstr.compareToIgnoreCase(llstr.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr2.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr3.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr4.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr5.toString()));
        System.out.println(llstr.compareToIgnoreCase(llstr6.toString()));









    }
}

