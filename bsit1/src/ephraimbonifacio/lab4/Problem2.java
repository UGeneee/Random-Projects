/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ephraimbonifacio.lab4;

/**
 *
 * @author Acer
 */
public class Problem2 {
    
    public static void main(String []args) {
    /* Problem 2: Write a program that will calculate the total sales of Uwa Eat Choys if your entire section bought
        pansit (Php30.00 each) for lunch. Thirteen (13) of you ordered coke sakto. How much will be the total payment of
        your section? */
     
     // total student = 32
     // pancit cost = 30.00
     // coke sakto price = 15.00
     // coke sakto order = 13
     // total payment to Uwa Eat Choys = ?

     float pancitCost = 30.00f;
     float cokeSaktoPrice = 15.00f;
     byte totalStudent = 32;
     byte cokeSaktoOrder = 13;

     float totalPancitAmount = pancitCost * totalStudent;
     float totalCokeSaktoAmount = cokeSaktoPrice * cokeSaktoOrder;
     float totalPayment = totalPancitAmount + totalCokeSaktoAmount;
     
     System.out.println("Total Payment of our Section to Uwa Eat Choys is: " + totalPayment + " pesos");
     
     System.out.println("");
    }
}
