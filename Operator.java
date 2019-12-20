public class Operator{
 	 
  double operation(double numOne,double numTwo,String operator){
   
  double num = 0;
 	
   if(operator.equals("+")){
       num = numOne + numTwo;
   }else if(operator.equals("-")){
  	
       num = numOne -numTwo;
   }else if(operator.equals("*")){
   
       num = numOne * numTwo;
   }else if (operator.equals("/")){
   	
       num = numOne / numTwo;
   }else{
       num = -999999999;	
   }
   
       return num;		
  }
}
