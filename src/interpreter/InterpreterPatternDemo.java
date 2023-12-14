/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

public class InterpreterPatternDemo {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
   
      public static Expression isSon(){
      Expression stuart = new TerminalExpression("Stuart");
      Expression robert = new TerminalExpression("Robert");
      return new AndExpression(robert, stuart);		
   }
      
      public static Expression isDaughter(){
      Expression stuart = new TerminalExpression("Mary");
      Expression robert = new TerminalExpression("Robert");
      return new AndExpression(robert, stuart);		
   }
   

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isSon = isSon();
      Expression isDaughter = isDaughter();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Stuart is a son of Robert? " + isSon.interpret("Stuart Robert"));
      System.out.println("Mary is a daughter of Robert? " + isDaughter.interpret("Mary Robert"));
   }
}