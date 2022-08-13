package work;

public class ZArrayPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	    int[][] multiarray = new int[2][3];
	    multiarray[0][0] = 1;
	    multiarray[0][1] = 1;
	    multiarray[0][2] = 1;
	    multiarray[1][2] = 2;
	    multiarray[1][0] = 3;
	    multiarray[1][1] = 4;
	    
	    for (int[] singlearray : multiarray) {
	    	for (int g : singlearray) {
		    	System.out.print(g +" ");
	    	}
	    	System.out.println(" ");
	    }
	 
	}

}
