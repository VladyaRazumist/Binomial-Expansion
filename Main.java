import java.math.BigInteger;
import java.util.*;
public class Main {
     public static long binomial (long n,long k){
        BigInteger fact=BigInteger.valueOf(1);
        BigInteger numerator=BigInteger.valueOf(1);
        for (long i=n;i>=n-k+1;i--){
            numerator=numerator.multiply(BigInteger.valueOf(i));
        }
        for (long i=1;i<=k;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        long res =numerator.divide(fact).longValue();
        System.out.println(fact+" "+numerator);
        return res;
    }
    
    
    
    public static void main(String [] args) {
   System.out.println(binomial(6,5));
   String s = new String ("(-12q+0)^3");
   String st=expand(s);
}
    
    
    public static String expand(String expr) {
        String s=expr;
        String xcoeff=expr;
        String sign=expr;
        String ycoeff=expr;
        String pow=expr;
        String result="";
        int trigger=0;
StringBuilder sb = new StringBuilder(expr);
s=s.replaceAll("[^a-zA-Z]", ""); // ИНДЕКС БУКВЫ
System.out.println(s);
xcoeff = xcoeff.substring(0, xcoeff.indexOf(s));
xcoeff=xcoeff.replace("(", ""); // Коэф при x;
sign=sign.substring(sign.indexOf(s)+1,sign.indexOf(s)+2);
System.out.println(xcoeff);
System.out.println("sign "+sign);
ycoeff=ycoeff.substring(ycoeff.lastIndexOf(sign)+1,ycoeff.indexOf(")"));
System.out.println("ycoeff "+ycoeff);
System.out.println("  xcoeff "+  xcoeff);
      pow=pow.substring(pow.indexOf("^")+1,pow.length());
        System.out.println(pow);
       long res;
       long binc;
       if (xcoeff.contains("-")){
           trigger++;
          xcoeff = xcoeff.replace("-", "");
       }
       if (xcoeff.equals("")){
           xcoeff="1";
       }
  int xf=Integer.parseInt(xcoeff);
  int yf=Integer.parseInt(ycoeff);
  int power =Integer.parseInt(pow);
  
  if ((sign.equals("+")&& trigger==0)||((sign.equals("-")&&trigger==1)&&(power%2==0))) {
  for (int i=power;i>-1;i--){
      binc=binomial(power,i);
      res=binc*(long)Math.pow(xf, i)*(long)Math.pow(yf,power-i);
     
      
      
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"+"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"+";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"+";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"+";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
  }
        System.out.println(result);
  }
  
  
   if (power%2==0 && ((sign.equals("+")&&trigger==1)||(sign.equals("-")&&trigger==0))) {
       // Четная степень с + - или - +
   for (int i=power;i>-1;i--){
      binc=binomial(power,i);
      res=binc*(long)Math.pow(xf, i)*(long)Math.pow(yf,power-i);
     
      // Позиция четная
      if (i%2==0) {
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"-"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"-";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"-";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"-";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
      }
      // Позиция нечетная
   if (i%2!=0) {
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"+"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"+";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"+";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"+";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
      }
  
      
      
      
  
       
       
   }
   System.out.println(result);
  
   }
   if (power%2!=0 && sign.equals("-") && trigger==0){
       // Четная степень с + - или - +
   for (int i=power;i>-1;i--){
      binc=binomial(power,i);
      res=binc*(long)Math.pow(xf, i)*(long)Math.pow(yf,power-i);
     
      // Позиция четная
      if (i%2==0) {
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"+"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"+";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"+";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"+";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
      }
      // Позиция нечетная
   if (i%2!=0) {
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"-"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"-";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"-";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"-";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
      }
  
      
      
      
  
       
       
   }
   System.out.println(result);
  
   }
   // Нечетная степень и - + 
   if (power%2!=0 && sign.equals("+") && trigger==1){
       result="-";
   for (int i=power;i>-1;i--){
      binc=binomial(power,i);
      res=binc*(long)Math.pow(xf, i)*(long)Math.pow(yf,power-i);
     
      // Позиция четная
      if (i%2==0) {
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"-"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"-";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"-";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"-";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
      }
      // Позиция нечетная
   if (i%2!=0) {
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"+"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"+";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"+";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"+";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
      }
  
      
      
      
  
       
       
   }
   System.out.println(result);
  
   }
   // Два минуса и нечетная степень
    if (sign.equals("-")&& trigger==1 && power%2!=0) {
        result="-";
  for (int i=power;i>-1;i--){
      binc=binomial(power,i);
      res=binc*(long)Math.pow(xf, i)*(long)Math.pow(yf,power-i);
     
      
      
      // Коэффициент == 1
if(res==1) {
    if (i!=0 && i!=1){
      result=result+s+"^"+Integer.toString(i)+"-"; // не пишем коэф если не конец
      } 
    if (i==1){
        result=result+s+"-";
    }
    
   if(i==0) {
          result=result+Long.toString(res);
      }
    
    
    
}
        
// Не 1 и не 0
if (res!=1 && res!=0){
      if (i!=0 && i!=1){
      result=result+Long.toString(res)+s+"^"+Integer.toString(i)+"-";
      } 
      if (i==1){
           result=result+Long.toString(res)+s+"-";
          
      }
      if (i==0){
          result=result+Long.toString(res);
      }
      
}
// 0
if (res==0){
    
}
  }
        System.out.println(result);
  }
  
  
  
  
  if (result.charAt(result.length()-1)=='+' || result.charAt(result.length()-1)=='-'){
      
      result=result.substring(0, result.length()-1);
     
  }
  
  
  System.out.println(result);
  
  
      
      
      
      return result;
  }
  
  
		
	}
