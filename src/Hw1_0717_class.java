
import java.util.Scanner;
public class Hw1_0717_class {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int i,ms_decide,n,enter_year; //n=哪一天   enter_year=輸入年  ms_decide=輸出空格的計算
		 // i=哪一個月
		 Scanner scanner = new Scanner(System.in);
		 
		    int year, month, first_space, feb_days; 
		    
		    System.out.printf("請輸入西元");
		    System.out.printf("\n");
		    Scanner scan = new Scanner(System.in);
		    
		    year=scan.nextInt();
		    
		    
		    System.out.printf("請輸入月份");
		    System.out.printf("\n");
		    month=scan.nextInt();
		    
		    
		    if(month<=12 && month>=1)
		    {
		    for(first_space=1,enter_year=0;enter_year<(year-1900);enter_year++)
		    {
		      if(enter_year%4==0 && enter_year%100!=0 || enter_year%400==100)
		       first_space=(first_space+366)%7;
		      else
		       first_space=(first_space+365)%7;   
		     }    //要知道下一年的1/1在星期幾,%7是代表前面有幾個空格
		     
		      //計算2月天數 
		      if(year%4==0 && year%100!=0 || year%400==0) 
		       {feb_days =29;}
		    else
		       {feb_days =28;}
		    
		      
		      
		    int days[]={0,31,feb_days,31,30,31,30,31,31,30,31,30,31}; 
		    int space[]={0,first_space,0,0,0,0,0,0,0,0,0,0,0};   
		    // 一個月有幾天 和  一個月的開始有幾個空格 的限制
		    


		    for(i=1;i<month;i++)
		    space[i+1]=(space[i]+days[i])%7;
		    
		    
		    System.out.printf("             %d年%d月\n\n",year,month); 
		    
		    System.out.printf("　　　　日　  一　  二　  三　  四　  五　　六　　\n   ");
		        for(ms_decide=1;ms_decide<=space[i];ms_decide++)
		        	System.out.printf("    ");       //計算空格從1開始,若還未到空格數,則繼續跑
		              
		        for(n=1;n<=days[i];n++)
		         {    
		        	System.out.printf(" %3d",n);
		          
		            if ((space[i]+n)%7==0) //一開始要把格子算進去   則(space+n)%7=0  就跳格
		        
		            {System.out.printf("\n   ");}
		          
		            } 
		           
		        System.out.printf("\n");
		     } 
		     
		     
	}

}
