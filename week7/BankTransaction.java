/** Application Purpose: This is the class for BankTranscation blueprint.
*   Author: Alex Dorodko
*   Date: 31/OCT/2020 
*   Time: 07:44 PM
*/

public class BankTransaction 
{
    //Starting up the variables.
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transcationReferenceNumber;

    //This is the counter for the records.
    public static int recordNumber = 0;

    //Making the constructor with the state.
    public BankTransaction(boolean canadianFunds, double exchangeRate, int transactionNumber, long transcationReferenceNumber)
    {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transcationReferenceNumber = transcationReferenceNumber;
    }


    //Setting up the getters.
    public void setCanadianFunds(boolean canadianFunds)
    {
        this.canadianFunds = canadianFunds;
    }

    public void setExchangeRate(double exchangeRate)
    {
        this.exchangeRate = exchangeRate;
    }

    public void setTransactionNumber(int transactionNumber)
    {
        this.transactionNumber = transactionNumber;
    }

    public void setTranscationReferenceNumber(long transcationReferenceNumber)
    {
        this.transcationReferenceNumber = transcationReferenceNumber;
    }


    //Setting up the setters.
    public boolean getCanadianFunds()
    {
        return canadianFunds;
    }

    public double getExchangeRate()
    {
        return exchangeRate;
    }

    public int getTransactionNumber()
    {
        return transactionNumber;
    }

    public long getTranscationReferenceNumber()
    {
        return transcationReferenceNumber;
    }




}