package pkg;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import pkg.Context;
import pkg.OperationAdd;
import pkg.OperationMultiply;
import pkg.OperationSubstract;

@Named(value = "StrategyPatternDemo")
@Dependent

public class StrategyPatternDemo {
     StringBuilder texto = new StringBuilder();
   //public static void main(String[] args) {
 public StrategyPatternDemo() {
    }      

        
      public StringBuilder getTexto() {  
      Context context = new Context(new OperationAdd());		
     texto.append(("10 + 5 = " + context.executeStrategy(10, 5)));
     
     context = new Context(new OperationSubstract());
     texto.append("10 - 5 = ").append(context.executeStrategy(10, 5));
     
     context = new Context(new OperationMultiply());		
    texto.append("10 * 5 = ").append(context.executeStrategy(10, 5));
    
      return texto;
   }
    

    