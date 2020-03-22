package service;
import java.util.Scanner;
// Create a class called FlamesCheckService
public class FlamesCheckService{
	
	
	public char findFlames(String name1, String name2){
		Scanner sc=new Scanner(System.in);
		StringBuffer s1=new StringBuffer(sc.next());
		StringBuffer s2=new StringBuffer(sc.next());
		
		char c,d,e='\0';
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				d=s2.charAt(j);
				if(c==d)
				{
					s1.deleteCharAt(i);
					s2.deleteCharAt(j);
					i--;
					j--;
					break;
				}
			}
		}
		s1=s1.append(s2);
		int k=6,l=0;
		String s3="FLAMES";
		while(k>1)
		{
			for(int m=1;m<s1.length();m++)
			{
				if(s3.charAt(l)!='X')
				{
					l++;
					if(l==6)
					l=0;
				}
				else
				{
					l++;
					if(l==6)
					l=0;
					m--;
				}
			}
			while(s3.charAt(l)=='X')
			{
				l++;
				if(l==6)
				l=0;
			}
			s3=s3.substring(0,l)+"X"+s3.substring(l+1);
			k--;
		}
		
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)!='X')
			e=s3.charAt(i);
		}
		switch(e)
		{
			case 'F':System.out.println("F");
					 break;
			case 'L':System.out.println("L");
					 break;
			case 'A':System.out.println("A");
					 break;
			case 'M':System.out.println("M");
					 break;
			case 'E':System.out.println("E");
					 break;
			case 'S':System.out.println("S");
					 break;
			default :break;
		}
		return e;
	}

//		 char result = 0;
//		    char[] f = { 'F', 'L', 'A', 'M', 'E', 'S' };
//		    char[] n1 = name1.toCharArray();
//		    char[] n2 = name2.toCharArray();
//		    int len = 0;
//		    for (int i = 0; i < n1.length; i++) {
//		      for (int j = 0; j < n2.length; j++) {
//		        if (n1[i] == n2[j])  {
//		          n1[i] = '0';
//		          n2[j] = '0';
//		          break;
//		        }
//		      }
//		    }
//		    for (int i = 0; i < n1.length; i++) {
//		      if (n1[i] != '0') {
//		        len++;
//		      }
//		    }
//		    for (int i = 0; i < n2.length; i++) {
//		      if (n2[i] != '0') {
//		        len++;
//		      }
//		    }
//		    int k = 1;int l = 0;int c = 1;
//		    for (;;)  {
//		      if (k == len)  {
//		        if (f[l] != '0')  {
//		          f[l] = '0';
//		          k = 1;
//		          l++;
//		          c++;
//		          if (l >= 6) {
//		            l = 0;
//		          }
//		          if (c == 6) {
//		            break;
//		          }
//		        } else {
//		          l++;
//		          if (l >= 6) {
//		            l = 0;
//		          }
//		        }
//		      } else  {
//		        if (f[l] != '0') {
//		          k++;
//		        }
//		        l++;
//		        if (l >= 6) {
//		          l = 0;
//		        }
//		      }
//		    }
//		    for (int i = 0; i < f.length; i++) {
//		      if (f[i] != '0') {
//		        if (f[i] == 'F') {
//		          result = 'F';
//		        } else if (f[i] == 'L') {
//		          result = 'L';
//		        } else if (f[i] == 'A') {
//		          result = 'A';
//		        } else if (f[i] == 'M') {
//		          result = 'M';
//		        } else if (f[i] == 'E') {
//		          result = 'E';
//		        } else if (f[i] == 'S') {
//		          result = 'S';
//		        }
//		      }
//		    }
//		   return result;
//		  	}
	
	}


// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

