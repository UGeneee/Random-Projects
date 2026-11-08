/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ephraimbonifacio.lab4;

/**
 *
 * @author Acer
 */
public class Problem4 {

    public static void main(String[] args) {
        /* Problem 4: You will be attending a birthday party of your cousin. You decided to save your allowance and buy an
        outfit online that fits the theme of the party. Calculate the total cost of your outfit if you have a 20% off voucher
        and 50 pesos discount on the delivery fee. */

        // voucher = 0.20
        // sf  discount = 50
        // outfit = 250
        // standard sf = 120
        float outfitPrice = 250.00f;
        float deliveryFee = 120.00f;

        float voucher = 0.20f;
        float sfDiscount = 50.00f;

        float voucherApplied = outfitPrice * voucher;
        float discountApplied = outfitPrice - voucherApplied;
        float sfDiscountApplied = deliveryFee - sfDiscount;
        float totalAmount = discountApplied + sfDiscountApplied;

        System.out.println("The Total Price of my Parcel is: " + totalAmount + " pesos");

    }

}
