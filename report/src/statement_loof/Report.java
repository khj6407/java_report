package statement_loof;

public class Report {
	
	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
	
		
		
	  } // end of class
	

	/*
	    *    [4-1] ������ ������� ���ǽ����� ǥ���϶�.
	      1. int �� ���� x�� 10���� ũ��  20���� ���� �� true �� ���ǽ�
		      
		      public static void main(String[] args) {
		      int x = 15;
		      
		      if(10 < x && x < 20){
		         System.out.println("true");
		      }
		         
		   }
	      2. char �� ���� ch�� �����̳� ���� �ƴ� �� true �� ���ǽ�
	      
		     char c = 'A';
			char cc = ' ';
			char ccc = '	';
				//��  = \t  ,  �ٹٲ� = \n
			if(c == cc ) {
				System.out.println("�����̾�!" );
			}  else if ( c == ccc ) {
				System.out.println("���̾�!");
			} else {
				System.out.println("���鵵 �ƴϰ� �ܵ� �ƴϾ�!");
			}
		
		
	      3. char �� ���� ch��  'x' �Ǵ� 'X' �� ��  true �� ���ǽ�
	      
		      public static void main(String[] args) {
		      char ch = 'x';
		      
		      if(ch == 'x' || ch == 'X' ) {
		         System.out.println("true");
		      }
		   }
	      4. char �� ����  ch �� ����(��0��~��9��)�� �� true �� ���ǽ� 
	      
		      public static void main(String[] args) {
			char ch = '5';
			
			if('0' <=ch && '9' >= ch ) {
				System.out.println("true");
			}
		
	      5. char �� ���� ch ��  ������  (�빮�� �Ǵ� �ҹ��� ) �� �� �� true ���ǽ�
	      
		      public static void main(String[] args) {
			char ch = '5';
			
			if('0' <=ch && '9' >= ch ) {
				System.out.println("true");
			}
		
	      6. int �� ���� year �� 400���� �����������ų� 4�� ������������ �Ǵ� 100 ���� ������������ ���� �� true �� ���ǽ� 
	      
		      public static void main(String[] args) {
			int year = 105;
			
			if(year % 400 == 0 && year % 4 == 0 || year % 100 != 0){
				System.out.println("true");
			}
	      7. boolean �� ���� powerOn �� false �� ��  true �� ���ǽ�
	      
		      public static void main(String[] args) {
			
			boolean powerOn = false;
			
			if(!powerOn) {
				System.out.println("true��");
			}
		      
	      8. ���ڿ� �������� str ��  ��yes���� ��  true �� ���ǽ�
	      
		      public static void main(String[] args) {
			
			String str = "yes";
			if(str == "yes") {
				System.out.println("true");
			}
	      
	      
	      [4-2] 1 ���� 20 ������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
	      
		      public static void main(String[] args) {
			
			int sum = 0;
			
			for(int i = 1; i < 21; i++) {
				if((i%2) > 0 || (i%3) > 0) {
					sum = sum + i;
				} // if end
			} // for end
			
			System.out.println("����� : " + sum + " ������");
			
		      
	      [4-4] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) . �� ����� ����Ͻÿ�.
	      
	      
	      [4-5] ������ for ���� while������ �����Ͻÿ�  .
	      ----------------------------------------------------------------
	      public class Exercise4_5 {
	          public static void main(String[] args) {
	              for(int i=0; i<=10; i++) {
	                  for(int j=0; j<=i; j++){
	                      System.out.print("*");
	                  }
	                  System.out.println();
	              }
	          } // end of main
	      } // end of class
	      ----------------------------------------------------------------
	      
	      
	      
	      [4-6] �� ���� �ֻ����� ������ �� ���� ���� 6 �� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	      
	      
	      
	      [4-7] Math.random() �� �̿��ؼ�  1����  6������ ������ ������ ���� value�� �����ϴ�
	      �ڵ带 �ϼ��϶� �� �˸��� �ڵ带 �����ÿ� . 
	      
	      class Exercise4_7 {
	          public static void main(String[] args) {
	              int value = (  );
	              System.out.println("value:"+value);
	          }
	      }
	      
	      
	      [4-10] int Ÿ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带
	      �ϼ��϶� ���� ���� num �� ���� 12345 ��� , ��1+2+3+4+5�� �� ����� 15�� ����϶�. (1)
	      �� �˸��� �ڵ带 �����ÿ�.
	      [ ] ���� ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
	      
	      class Exercise4_10 {
	          public static void main(String[] args) {
	              int num = 12345;
	              int sum = 0;
	               . �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
	              
	              System.out.println("sum="+sum);
	          }
	      }
	      [ ] ������
	      15
	      
	      
	      
	      
	      [4-11] 2�� ���� 9�� ���� �������� �ݺ����� ���� ����Ͻÿ�.
	      
	      
	      
	      
	      
	      [4-13] ������ �־��� ���ڿ� (value) �� ���������� �Ǻ��ϴ� ���α׷��̴� (1) �� �˸��� 
	      �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
	      
	      class Exercise4_13 {
	      public static void main(String[] args){
	              String value = "12o34";
	              char ch = ' ';
	              boolean isNumber = true;
	              // charAt(int i) �ݺ����� �� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о �˻��Ѵ�
	              
	              for(int i=0; i < value.length() ;i++) {
	                 
	                  (1) . �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
	                
	              }
	              
	              
	              if (isNumber) {
	                  System.out.println(value+" ."); �� �����Դϴ�
	              } else {
	                  System.out.println(value+" ."); �� ���ڰ� �ƴմϴ�
	              }
	              
	              
	          } // end of main
	      } // end of class
	      
	      [ ] ������
	      12o34 �� ���ڰ� �ƴմϴ�.

	    */
}
