
import java.util.Scanner;
public class Hw1_0717_class {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int i,ms_decide,n,enter_year; //n=���@��   enter_year=��J�~  ms_decide=��X�Ů檺�p��
		 // i=���@�Ӥ�
		 Scanner scanner = new Scanner(System.in);
		 
		    int year, month, first_space, feb_days; 
		    
		    System.out.printf("�п�J�褸");
		    System.out.printf("\n");
		    Scanner scan = new Scanner(System.in);
		    
		    year=scan.nextInt();
		    
		    
		    System.out.printf("�п�J���");
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
		     }    //�n���D�U�@�~��1/1�b�P���X,%7�O�N��e�����X�ӪŮ�
		     
		      //�p��2��Ѽ� 
		      if(year%4==0 && year%100!=0 || year%400==0) 
		       {feb_days =29;}
		    else
		       {feb_days =28;}
		    
		      
		      
		    int days[]={0,31,feb_days,31,30,31,30,31,31,30,31,30,31}; 
		    int space[]={0,first_space,0,0,0,0,0,0,0,0,0,0,0};   
		    // �@�Ӥ릳�X�� �M  �@�Ӥ몺�}�l���X�ӪŮ� ������
		    


		    for(i=1;i<month;i++)
		    space[i+1]=(space[i]+days[i])%7;
		    
		    
		    System.out.printf("             %d�~%d��\n\n",year,month); 
		    
		    System.out.printf("�@�@�@�@��@  �@�@  �G�@  �T�@  �|�@  ���@�@���@�@\n   ");
		        for(ms_decide=1;ms_decide<=space[i];ms_decide++)
		        	System.out.printf("    ");       //�p��Ů�q1�}�l,�Y�٥���Ů��,�h�~��]
		              
		        for(n=1;n<=days[i];n++)
		         {    
		        	System.out.printf(" %3d",n);
		          
		            if ((space[i]+n)%7==0) //�@�}�l�n���l��i�h   �h(space+n)%7=0  �N����
		        
		            {System.out.printf("\n   ");}
		          
		            } 
		           
		        System.out.printf("\n");
		     } 
		     
		     
	}

}
