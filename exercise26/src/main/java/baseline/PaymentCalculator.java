/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

public class PaymentCalculator {

    public short calculateMonthsUntilPaidOff(double balance, double apr, double payment){
        Solution26 sol = new Solution26();
        float dailyRate = (float)apr/365;
        double roundedBalancePayment = sol.roundToNextCent(balance/payment);
        double monthsDouble = Math.ceil(-((double)1/30) * sol.roundToNextCent(Math.log(1 + roundedBalancePayment * (1 - sol.roundToNextCent(Math.pow((1 + dailyRate), 30))))) / Math.log(1 + dailyRate));
        return (short) sol.roundToNextCent(monthsDouble);
    }
}
