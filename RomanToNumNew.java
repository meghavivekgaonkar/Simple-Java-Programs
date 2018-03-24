import java.util.Scanner;

public class RomanToNumNew {
	public static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		String roman;
		Scanner s=new Scanner(System.in);
		roman=s.next();
		
		int[] arr=new int[roman.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=value(roman.charAt(i));
		}
		if(arr.length==1)
		{
			num=arr[0];
		}
		for(int i=0;i<roman.length();i++) {
			if(i+1<roman.length())
			{
				if(value(roman.charAt(i+1))>value(roman.charAt(i)))
				{
					num+=value(roman.charAt(i+1))-value(roman.charAt(i));
				}
				else
				{
					num+=value(roman.charAt(i));
				}
			}
		}
		System.out.println("Number: "+num);
		s.close();
		

	}
	

}
