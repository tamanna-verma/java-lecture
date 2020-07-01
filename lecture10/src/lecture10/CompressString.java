package lecture10;
import java.util.Scanner;
public class CompressString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
	str=str+" ";
		int n=str.length();
		
		String str1=str.charAt(0)+"";
				
				int count=1;
				for(int i=1;i<n;i++) 
		        {
		           
					if(str.charAt(i)==str.charAt(i-1)) 
				{
				count=count+1;
		            
				}
		           else{
		               if(count>1){
		                  str1=str1+count+str.charAt(i) ;
		                   count=1;
		               }
		               else{
		                    str1=str1+str.charAt(i) ;
		                   count=1;
		               }
		           }
		        }
		System.out.println(str1);}
	}
