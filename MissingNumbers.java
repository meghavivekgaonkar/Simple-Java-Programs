import java.util.Arrays;

public class MissingNumbers {
	
	 public static int makeArrayConsecutive2(int[] statues) {
		 Arrays.sort(statues);
		    int count=0;
		    for(int i=1;i<statues.length;i++){
		        if(statues[i]-statues[i-1]>1){
		            count+=statues[i]-statues[i-1]-1;
		        }    
		    }
		    return count;
		}




	public static void main(String[] args) {
		int[] statues= {6, 2, 3, 8};
		System.out.println(makeArrayConsecutive2(statues));

	}

}
