import java.util.Scanner;

public class CBTreeTest_asdf
{
	public static void main(String[] ar)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		CBTree[] CBtrees = new CBTree[n];
		for(int i = 0; i < n; i++) {
			String s1 = in.next();
			String s2 = in.next();
			CBtrees[i] = new CBTree(s1, s2);
		}

		while(in.hasNextLine()) {
			int k = in.nextInt();
			String func = in.next();
			if(func.equals("POT"))
				System.out.println(CBtrees[k].postOrderTraversal());
			else if(func.equals("IOT"))
				System.out.println(CBtrees[k].inOrderTraversal());
			else if(func.equals("POS"))
				System.out.println(CBtrees[k].postOrderStructure());
			else if(func.equals("IOS"))
				System.out.println(CBtrees[k].inOrderStructure());
			else
				break;
		}

		//CBTree cbt = new CBTree("0101011", "TCS");
		//CBTree cbt = new CBTree("00011101011", "ABCDE");

		/*
		System.out.println(cbt.postOrderTraversal());
		System.out.println(cbt.inOrderTraversal());
		System.out.println(cbt.postOrderStructure());
		System.out.println(cbt.inOrderStructure());
		*/
	}
}

