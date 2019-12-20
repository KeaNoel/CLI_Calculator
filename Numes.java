import java.util.*;

public class Numes{	

  boolean nums() {

        System.out.print("请输入第一个数：");
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        double numOne = Double.valueOf(one);
		
	  //boolean oneIf = one.equals(("^([0-9]*$)|^(([0-9]{1,}[.][0-9]*)$)"))==false;	  	
	  //try{
		//if(oneIf){
			//throw new NumberException("数字异常");
		//}
	  //}catch(NumberException e){
		//e.printStackTrace();
	   //}      
	
        System.out.println("目前提供运算符：+  -  *  /");
        System.out.print("请选择指定运算符：");
        String operator = scanner.nextLine();
        boolean  operatorIf = "+".equals(operator)==false&&"-".equals(operator)==false&&"*".equals(operator)==false&&"/".equals(operator)==false;
        try {
		          
              if(operatorIf){
	    		 throw new OperatorException("运算符异常"); 
              }else {
			 System.out.print("请输入第二个数：");
        		 double numTwo = Double.valueOf(scanner.nextLine());
       	      		 double num = new Operator().operation(numOne,numTwo,operator);
          
        		   if(num == -999999999){     
            	     		 System.out.println("超出计算范围!请输入符合范围的数！");
        		   }else {
				System.out.println("计算出的结果为："+num);
	  		   }
	            }
 	
	}catch(OperatorException e){
	       e.printStackTrace();
	}



        System.out.print("是否继续操作该计算器YES/NO：");
        String message = scanner.nextLine();
        if("YES".equals(message) || "yes".equals(message)){ 
            return true;
        }else {
            return false;	  
	  
      }
  }
}
