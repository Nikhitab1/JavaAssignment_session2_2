
public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int row,col,size=5;
		 
		 for(row=0;row< size;row++){
			 for(col=0;col<size;col++){
				 if(row == col||row+col==size-1) //1)If the row and col indices are same then print x
					                             //2) OR if row and col sum is one less than the size of a matrix then print x
				 {
					 System.out.print("x");
					 
				 }
				 else {
					 System.out.print("-"); //Else print hyphen at rest of the indices
				 }
			 }
			 System.out.println();
		 }
		 
	}

}
