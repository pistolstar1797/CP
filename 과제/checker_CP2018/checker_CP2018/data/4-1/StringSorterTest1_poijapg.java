import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StringSorterTest1_poijapg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        ArrayList<String> aL = new ArrayList<>(50);
        while(sc.hasNext()) {
            String get = sc.next();
            aL.add(get);
        }

        String[] seq = new String[aL.size()], temp;
        seq = aL.toArray(seq);

        StringSorter k = new StringSorter();

        temp = seq.clone();
        k.selectionSort(temp);
        System.out.println("Sel: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();


        temp = seq.clone();
        k.insertionSort(temp);
        System.out.println("Ins: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();

        k = new StringSorter();

        temp = seq.clone();
        k.bubbleSort(temp);
        System.out.println("Bub: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();


        temp = seq.clone();
        k.mergeSort(temp);
        System.out.println("Mer: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();

        System.out.println("BASE CASE BELOW");
        System.out.println("-------------------------------------------");
        dosth();
    }

    static void dosth() {
        String[] seq = {"hello", "garbage", "world", "java", "garbaaa", "garbag", "jaca", "javac"};
        //String[] seq = {};
        String[] temp;

        StringSorter k = new StringSorter();

        temp = seq.clone();
        k.selectionSort(temp);
        System.out.println("Sel: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();


        temp = seq.clone();
        k.insertionSort(temp);
        System.out.println("Ins: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();

        k = new StringSorter();

        temp = seq.clone();
        k.bubbleSort(temp);
        System.out.println("Bub: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();


        temp = seq.clone();
        k.mergeSort(temp);
        System.out.println("Mer: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();


        seq = new String[] {
                "hello",
                "garbage",
                "world",
                "wjiagop",
                "asdf",
                "asdef",
                "yuptn",
                "asdwet",
                "wetwert",
                "wertwer",
                "wertwtwtt",
                "dnwanna",
                "aenrnantnat",
                "asdfagwag",
                "java",
                "garbaaa",
                "garbag",
                "jaca",
                "javac"
        };


        temp = seq.clone();
        k.selectionSort(temp);
        System.out.println("Sel: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();


        temp = seq.clone();
        k.insertionSort(temp);
        System.out.println("Ins: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();

        k = new StringSorter();

        temp = seq.clone();
        k.bubbleSort(temp);
        System.out.println("Bub: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();


        temp = seq.clone();
        k.mergeSort(temp);
        System.out.println("Mer: ");
        for(int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
        System.out.println();
    }
}
