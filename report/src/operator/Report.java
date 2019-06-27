package operator;

public class Report {
	/*public static void main(String[] args) {
		int numOfApples = 159; // 사과의 개수
        int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
        
        // 10으로 나누었을 때 딱 떨어지는 경우 :   numOfApples / sizeOfBucket : 정답
        // 10으로 나우었을 때 나머지가 남는 경우 :  numOfApples / sizeOfBucket + 1 : 정답
        int numOfBucket = numOfApples % 10 > 0 ? (numOfApples / sizeOfBucket) + 1 : numOfApples / sizeOfBucket;
        
        System.out.println(" 필요한 바구니의 수  :" + numOfBucket);
        }
       
        [3-3] 아래는 변수 의 값에 따라 num ‘1 ’, ‘ -1’, ‘0’ 양수 음수 0을 출력하는 코드이다 삼항 연산 .
		자를 이용해서 에 알맞은 코드를 넣으시오 (1) .
		[Hint] 삼항 연산자를 두 번 사용하라.
		==============================================================
		class Exercise3_3 {
		
        public static void main(String[] args) {
        int num = 10;
        String str = num >= 0 ? "정수" : "음수" ;
        
        if(str.equals("정수")) {
        	str = num == 0 ? "0" : "정수";
        }
        
        System.out.println(str);
       
		}
		
		[3-4] 아래는 변수 의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num. num
		의 값이 '456'이라면 '400'이 되고 '111'이라면 '100'이 된다 에 알맞은 코드를 넣으
		시오.
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
	
		[3-5] 아래는 변수 의 값 중에서 일의 자리를 로 바꾸는 코드이다 만일 변수 의 num 1 . num
		값이 333이라면 331이 되고 777이라면771 이 된다 에 알맞은 코드를 넣으시오 .
		==============================================================
		
	    public static void main(String[] args) {
	        int num = 777;
	        System.out.println(num/10+"1");
	    }

		[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
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

		[3-9] 다음은 문자형 변수 가 영문자 대문자 또는 소문자 이거나 숫자일 때만 변수 ch ( ) b
		의 값이 true가 되도록 하는 코드이다 에 알맞은 코드를 넣으시오 true .
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
	
		[3-10] 다음은 대문자를 소문자로 변경하는 코드인데 문자 에 저장된 문자가 대문자 , ch
		인 경우에만 소문자로 변경한다 문자코드는 소문자가 대문자보다 만큼 더 크다 예를 . 32 .
		들어 의 코드는 이고 의 코드는 이다 에 알맞은 코드를 넣으시오 'A‘ 65 ’a' 97 . (1)~(2) .
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
		[ ] 실행결과
		ch:A
		ch to lowerCase:a
	 */

	 	
	    
}
