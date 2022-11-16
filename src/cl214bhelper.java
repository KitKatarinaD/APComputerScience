public class cl214bhelper {
    // integer ID,  decimal ytd pay, decimal base pay, decimal shift code and decimal hours worked.
    private int myID;
    private double myytdPay;
    private double  mybasepay;
    private double myshiftCode;
    private double myhrsworked;
    private double grosspay;

    public cl214bhelper(int ID, double ytdpay, double basepay, double shiftCode, double hrsworked) {
        myID = ID;
        myytdPay = ytdpay;
        mybasepay = basepay;
        myshiftCode = shiftCode;
        myhrsworked = hrsworked;
        grosspay = 0;
    }


}
/* compute the employee’s gross pay, withholding tax, social security tax, and net pay,
and print these results along with the employee’s number.

The gross pay is found by multiplying the hours worked by the pay rate where
the pay rate is the product of the base pay rate and the shift factor.


The withholding tax is the product of the gross pay and the tax rate.
The tax rate is found from the following table:
Less than $100.00                                                                  0
$100.00 to $149.99					 8%
$150.00 to $199.00                                                               12%
$200.00 to $299.99                                                               15%
$300.00 or  more                                                                   17.5%

The social security tax (FICA tax) depends on the gross pay and the year-to-date pay.
If the year-to-date pay is greater than $17,300, then there is no social security tax.
 If the year-to-date pay plus the gross pay is less than or equal to $17,300, then the
 social security tax is 6.05% of the gross pay. If the year-to-date pay is less then
 $17,300, but the sum of the year-to-date pay and gross pay is greater than $17,300,
  then the tax is 6.05% of the difference between $17,300 and the year-to-date pay
   plus the gross pay.

Sample output:

Employee number 1001
Hours 34.50  Rate 4.50  Shift Factor 1.25
             Current         Year-to date
Gross Pay    194.06      1056.10
Withholding    23.29
FICA               11.74
Net Pay        159.03

Employee number 1002
Hours 25.00  Rate 3.25  Shift Factor 1.00
             Current        Year-to date
Gross Pay     81.25      3970.00
Withholding     0.00
FICA                4.92
Net Pay         76.33



 */