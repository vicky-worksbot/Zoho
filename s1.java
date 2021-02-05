import java.util.*;
class s1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char c[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(c[i]>64 && c[i]<92)
			  {
				c[i]=(char)(c[i]+32)
;
		          }
			System.out.print(c[i]);
		}
		System.out.println();
		int s=0;
		String k="";
		for(int i=0;i<c.length;i++)
		  {
			if(c[i]>=48 && c[i]<=57)
				s+=c[i]-48;
		  }
		 for(int i=0;i<c.length;i++)
		  {
			if(c[i]>96 && c[i]<123){
			     int w=c[i]+s;
			     if(w>122)
				{
				  w=96+s;
				}
			     k+=""+(char)(w);
			}
		  }
		
		System.out.println("output is "+k);
	}
}




// I learn this project
/*
	1.Convert uppercase to LowerCase using ASCII value
	2.Convert String int to normal int using ASCII value
	3.Proram must print the alphabets which are s position from the alphabets present in the string