import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int b=0,i,r,j=1,k;
      k=n;
      while(n!=0)
      {
        r=n%10;
        for(i=1;i<=r;i++)
        {
          j=j*i;
        }
        b=b+j;
        
        n=n/10;
        j=1;
      }
      if(b==k)
        System.out.println("Yes");
      else
        System.out.println("No");
          
         
	}
}