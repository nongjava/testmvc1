package testmvc;

public class Model {
   private String answer,answer2;
   int count =0;
   int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
    public void check(int StudentID,int Password) {
    	if(StudentID == 59050900 && Password == 1872) {
    		answer = "Join";
    		a = 1;
    		count+=1;
    	}else if(StudentID == 59050911 && Password == 8899) {
    		answer = "Join";
    		b = 1;
    		count+=1;
    	}else if(StudentID == 59050922 && Password == 6914) {
    		answer = "Join";
    		c = 1;
    		count+=1;
    	}else if(StudentID == 59050933 && Password == 1121) {
    		answer = "Join";
    		d = 1;
    		count+=1;
    	}else if(StudentID == 59050944 && Password == 958) {
    		answer = "Join";
    		e = 1;
    		count+=1;
    	}else if(StudentID == 59050955 && Password == 1111) {
    		answer = "Join";
    		f = 1;
    		count+=1;
    	}else if(StudentID == 59050966 && Password == 6453) {
    		answer = "Join";
    		g = 1;
    		count+=1;
    	}else if(StudentID == 59050977 && Password == 4117) {
    		answer = "Join";
    		h = 1;
    		count+=1;
    	}else if(StudentID == 59050988 && Password == 7000) {
    		answer = "Join";
    		i = 1;
    		count+=1;
    	}else if(StudentID == 59050999 && Password == 8143) {
    		answer = "Join";
    		j = 1;
    		count+=1;
    	}else { answer = "Wrong StudentID or Password";
    		
    	}
    	
    }
    public String getanswer(){
		return answer;
    
    }
    public void checkid(int StudentID) {
    	if(StudentID == 59050900 && a == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050911 && b == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050922 && c == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050933 && d == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050944 && e == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050955 && f == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050966 && g == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050977 && h == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050988 && i == 1) {
    		answer2 = "already join";
    	}else if(StudentID == 59050999 && j == 1) {
    		answer2 = "already join";
    	}else { answer2 = "not join";
    		
    	}
    }
    public String getcheckid() {
    	return answer2;
    }
   public void count() {
	   count =count+0;
   }
    public int checkcount() {
    	
    	return count;
    }
}
