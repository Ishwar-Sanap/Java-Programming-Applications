import java.lang.*;

abstract class RBI
{
    public int Balance;
    public RBI()
    {
        this.Balance =0;
    }

    public void Credit(int Amount)
    {
      Balance =  (this.Balance) + Amount;
    }

    public void Debit(int Amount)
    {
       Balance = (this.Balance) - Amount;
    }

    public abstract int ROI(); // Abstract Method 
}

class SBI extends RBI
{
   public int ROI()  // concreate method
    {
        return 6;
    }
}

class PNB extends RBI
{
    public int ROI() // concreate method
    {
        return 7;
    }   
}

class AbstractDemo {
    public static void main(String[] args) {
        SBI sobj = new SBI();

        sobj.Credit(1000);
        System.out.println("1000 rs Creadited in your account");

        sobj.Debit(100);
        System.out.println("100 rs Debited from your account");

        System.out.println(sobj.Balance);
    }
}
