
public class StringParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1={"s1 0","s1 1","s1 2"};
		String[] s2={"s2 0","s2 1","s2 2"};
		String[] s3={"s3 0","s3 1","s3 2"};
		String[] s4=s1;
		StringParameterTest.updateStrings1(s1);
		for (String s:s1)
			System.out.println(s);
		for (String s:s4)
			System.out.println(s);
		StringParameterTest.updateStrings2(s2);
		for (String s:s2)
			System.out.println(s);
		StringParameterTest.updateStrings3(s3);
		for (String s:s3)
			System.out.println(s);
	}
	public static void updateStrings1(String[] strings){
		for (int index=0;index<strings.length;index++)
			strings[index]+=" updated";
	}
	public static void updateStrings2(String[] strings){
		String[] s={"s 0","s 1","s 2"};
		strings=s;
	}
	public static void updateStrings3(String[] strings){
		for (int index=0;index<strings.length;index++)
			StringParameterTest.updateString(strings[index]);
	}
	public static void updateString(String string){
		string+=" updated";
	}


	

}
