import java.util.HashMap;
import java.util.Scanner;

//Ask Question what you want result for 0/0 , for -ve numbers, / by zero 
public class FractionToDecimal {
	public String fractionToDecimal(int numerator, int denominator) {
		if (numerator == 0)
			return "0";
		if (denominator == 0)
			return "Error";
	 
		String result = "";
	 
		// is result is negative
		if ((numerator < 0) ^ (denominator < 0)) {
			result += "-";
		}
	 
		// convert int to long
		long num = numerator, den = denominator;
		num = Math.abs(num);
		den = Math.abs(den);
	 
		// quotient 
		long res = num / den;
		System.out.println("res value:"+res+"\n");
		result += String.valueOf(res);
	 
		// if remainder is 0, return result
		long remainder = (num % den) * 10;
		if (remainder == 0)
			return result;
	 
		// right-hand side of decimal point
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		result += ".";
		while (remainder != 0) {
			// if digits repeat
			if (map.containsKey(remainder)) {
				int beg = map.get(remainder); 
				String part1 = result.substring(0, beg);
				System.out.println("Part 1 "+part1);
				String part2 = result.substring(beg, result.length());
				System.out.println("Part 2 "+part2);
				result = part1 + "(" + part2 + ")";
				return result;
			}
	 
			// continue
			map.put(remainder, result.length());
			res = remainder / den;
			result += String.valueOf(res);
			remainder = (remainder % den) * 10;
			for (HashMap.Entry<Long, Integer> entry : map.entrySet()) {
	            Long key = entry.getKey();
	            Integer values = entry.getValue();
	            System.out.println("Key = " + key);
	            System.out.println("Values = " + values + "\n");
	        }
			
		}
		
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractionToDecimal f= new FractionToDecimal();
		System.out.print("Enter Numerator\n");
		Scanner s =new Scanner(System.in);
		int num =s.nextInt();
		System.out.print("Enter Denominator\n");
		int den =s.nextInt();
		s.close();
		System.out.println("Result: "+f.fractionToDecimal(num, den));
	}

}
