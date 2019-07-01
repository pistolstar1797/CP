public class TEST2_tonatnjtaknjawe {
    public static void test() {

        LLString llstr = new LLString("QWEripjo9992q53jo994134");
        llstr.concat("ppopjioiojpjoiq257890");
        llstr.concat(new LLString("ppopjioiojpjoiq257890"));
        System.out.println(llstr.charAt(11));
        System.out.println(llstr.length());
        System.out.println(llstr.toString());
        llstr = llstr.concat("ppopjioiojpjoiq257890");

        LLString llstr2 = new LLString("jo99");
        System.out.println(llstr.indexOf(llstr2.toString()));
        System.out.println(llstr.indexOf(llstr2.toString()));
        System.out.println(llstr.indexOf(llstr2.toString(), 6));
        System.out.println(llstr.indexOf(llstr2.toString(), 10));
        System.out.println(llstr.indexOf(llstr2.toString(), 16));
        System.out.println(llstr.indexOf(llstr2.toString(), 18));
        System.out.println(llstr2.charAt(3));
        System.out.println(llstr2.length());
        System.out.println(llstr2.toString());

        llstr2.concat(new LLString("4"));
        System.out.println(llstr.indexOf(llstr2.toString()));
        System.out.println(llstr.indexOf(llstr2.toString(), 6));
        System.out.println(llstr.indexOf(llstr2.toString(), 10));
        System.out.println(llstr.indexOf(llstr2.toString(), 16));
        System.out.println(llstr.indexOf(llstr2.toString(), 18));
        System.out.println(llstr2.charAt(2));
        System.out.println(llstr2.length());
        System.out.println(llstr2.toString());

        llstr2 = llstr2.concat(llstr2.concat(llstr));
        System.out.println(llstr.indexOf(llstr2.toString()));
        System.out.println(llstr.indexOf(llstr2.toString(), 6));
        System.out.println(llstr.indexOf(llstr2.toString(), 10));
        System.out.println(llstr.indexOf(llstr2.toString(), 16));
        System.out.println(llstr.indexOf(llstr2.toString(), 18));
        System.out.println(llstr2.charAt(11));
        System.out.println(llstr2.length());
        System.out.println(llstr2.toString());

        System.out.println(TEST1_tonatnjtaknjawe.NORM(llstr.compareTo(llstr2.concat(llstr))));
        System.out.println(llstr2.indexOf('o'));
        System.out.println(llstr2.indexOf('2', 10));
        System.out.println(llstr2.indexOf('3', 10000000));
        llstr2.replace('9', 'Z');
        System.out.println(llstr2);

        LLString llstr6 = llstr2.replace('9', 'Z');
        System.out.println(llstr2);
        System.out.println(llstr6);
        System.out.println(llstr6.length());
    }
}
