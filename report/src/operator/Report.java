package operator;

public class Report {
	/*public static void main(String[] args) {
		int numOfApples = 159; // ����� ����
        int sizeOfBucket = 10; // ( ) �ٱ����� ũ�� �ٱ��Ͽ� ���� �� �ִ� ����� ����
        
        // 10���� �������� �� �� �������� ��� :   numOfApples / sizeOfBucket : ����
        // 10���� ������� �� �������� ���� ��� :  numOfApples / sizeOfBucket + 1 : ����
        int numOfBucket = numOfApples % 10 > 0 ? (numOfApples / sizeOfBucket) + 1 : numOfApples / sizeOfBucket;
        
        System.out.println(" �ʿ��� �ٱ����� ��  :" + numOfBucket);
        }
       
        [3-3] �Ʒ��� ���� �� ���� ���� num ��1 ��, �� -1��, ��0�� ��� ���� 0�� ����ϴ� �ڵ��̴� ���� ���� .
		�ڸ� �̿��ؼ� �� �˸��� �ڵ带 �����ÿ� (1) .
		[Hint] ���� �����ڸ� �� �� ����϶�.
		==============================================================
		class Exercise3_3 {
		
        public static void main(String[] args) {
        int num = 10;
        String str = num >= 0 ? "����" : "����" ;
        
        if(str.equals("����")) {
        	str = num == 0 ? "0" : "����";
        }
        
        System.out.println(str);
       
		}
		
		[3-4] �Ʒ��� ���� �� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴� ���� ���� num. num
		�� ���� '456'�̶�� '400'�� �ǰ� '111'�̶�� '100'�� �ȴ� �� �˸��� �ڵ带 ����
		�ÿ�.
		==============================================================
	     public static void main(String[] args) {
        int num = 456;
        System.out.println(  );
    	}
		}

		public static void main(String[] args) {
		
		int num = 456;
		System.out.println(num/100*100);
	}
	
		[3-5] �Ʒ��� ���� �� �� �߿��� ���� �ڸ��� �� �ٲٴ� �ڵ��̴� ���� ���� �� num 1 . num
		���� 333�̶�� 331�� �ǰ� 777�̶��771 �� �ȴ� �� �˸��� �ڵ带 �����ÿ� .
		==============================================================
		
	    public static void main(String[] args) {
	        int num = 777;
	        System.out.println(num/10+"1");
	    }

		[3-8] �Ʒ� �ڵ��� �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
		==============================================================
		class Exercise3_8 {
	    public static void main(String[] args) {
	        byte a = 10;
	        byte b = 20;
	        int c = a + b;
	        char ch = 'A';
	        ch++;
	        ch++;
	        float f = 3f / 2f;
	        long l = 3000L * 3000L * 3000L;
	        float f2 = 0.1f;
	        double d = 0.1f;
	        boolean result = d==f2;
	        System.out.println("c="+c);
	        System.out.println("ch="+ch);
	        System.out.println("f="+f);
	        System.out.println("l="+l);
	        System.out.println("result="+result);
	    }
}

		[3-9] ������ ������ ���� �� ������ �빮�� �Ǵ� �ҹ��� �̰ų� ������ ���� ���� ch ( ) b
		�� ���� true�� �ǵ��� �ϴ� �ڵ��̴� �� �˸��� �ڵ带 �����ÿ� true .
		==============================================================
		class Exercise3_9 {
	    public static void main(String[] args) {
	   char ch = 'Z';
	        boolean b;
	        
	        if(65 <= ch && ch <= 90) {
	        	b = true;
	        }else if(97 <= ch && ch <= 122) {
	        	b = true;
	        }else if(48 <= ch && ch <= 57) {
	        	b = true;
	        } else {
	        	b = false;
	        }
	        		
	        		
	        System.out.println(b);
    }
	}
	
		[3-10] ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε� ���� �� ����� ���ڰ� �빮�� , ch
		�� ��쿡�� �ҹ��ڷ� �����Ѵ� �����ڵ�� �ҹ��ڰ� �빮�ں��� ��ŭ �� ũ�� ���� . 32 .
		��� �� �ڵ�� �̰� �� �ڵ�� �̴� �� �˸��� �ڵ带 �����ÿ� 'A�� 65 ��a' 97 . (1)~(2) .
		==============================================================
		class Exercise3_10 {
		    public static void main(String[] args) {
		  	char ch = 'H';
		  	boolean flag = false;
		  	if(65 <= ch && ch <= 90) {
		  		flag = true;
		  	}
		  	
		  	
		  	if(flag) {
		  		ch = (char)(ch + 32);
		  		System.out.println(ch);
		  	}  	
		  	
	    }
		==============================================================
		[ ] ������
		ch:A
		ch to lowerCase:a
	 */

	 	
	    
}
