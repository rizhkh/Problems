import java.util.*;


class maxsubarray {
    public int maxSubArray(int[] A) {

	    // General algorithm approach: Move through each index sum up their value, if the value
	    // is greater replace the vvalue else keep it and that is your answer


	    int temp = A[0];
	    //int initialPos = 0;
	    //int lastPos = 0;
	    int sum = 0;

	    int i = 0;
	    int j = i;
	    while(i<A.length)
	    {
	        sum = sum + A[j];
	        if(sum>temp)
	        {
	          // initialPos = i;
	          //  lastPos = j;
	          temp = sum;
	        }

	        if(j==A.length-1)
	        {
	            sum = 0;
	            i++;
	            j=i;
	        }

	        else
	        {
	            j++;
	        }
	    }
	    return temp;
}
}