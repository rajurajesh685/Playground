import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int rev=0,r,k;
      k=n;
      while(n!=0)
      {
        r=n%10;
        rev=rev+r*r*r;
        n=n/10;
      }
      if(rev==k)
      {
        System.out.println("Armstrong Number");
      }
        else
        {
          System.out.println("Not a Armstrong Number");
        }
      
	}
}