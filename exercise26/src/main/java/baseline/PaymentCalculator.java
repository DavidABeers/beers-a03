package baseline;

public class PaymentCalculator {

    public short calculateMonthsUntilPaidOff(double balance, double apr, double payment){
        // dailyRate = apr/365
        // months = -(1/30) * log(1 + balance/payment * (1 - (1 + dailyRate)^30) / log(1 + dailyRate)
        // return months
    }
}
