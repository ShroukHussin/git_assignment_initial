/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Alaa elnaggar
 pull request for omar
 */
public class multiplicationseries implements ISubscriber{
    public void MultiplicationSeries(int number){
    int i,fact=1;
    for(i=1;i<=number;i++)
    {
    fact=fact*i;
    }
        System.out.println("MultiplicationSeries of "+number+" is : " + fact);
    
    }
   @Override
  public void notifySubscriber(String input){
      int N = Integer.parseInt(input);
       MultiplicationSeries(N);
  
  }
    
}
