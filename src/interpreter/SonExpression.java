/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.Arrays;

public class SonExpression implements Expression {
  private String father;
   private String son;

   public SonExpression(String father, String son) {
      this.father = father;
      this.son = son;
   }

   @Override
   public boolean interpret(String context) {
      // Check if the given context implies that the specified person is a son.
      String[] contextArray = context.split("\\s+");
      return Arrays.asList(contextArray).contains(son) && Arrays.asList(contextArray).contains(father);
   }
}