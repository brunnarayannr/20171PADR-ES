package pkg;


public class Context {
  // atributos iniciais
   private Strategy strategy;
  // atributos finais

   public Context(Strategy strategy){
      this.strategy = strategy;
   }
  // m�todos iniciais

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
  // m�todos finais
}