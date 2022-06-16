
public class Men extends Clothing
{
  public boolean hasCollar; 

  public Men()  
  {
    super();
    hasCollar = true;
  }

  public Men(double p, String c, String n, int q, String b, String s, boolean hC)
  {
    super(p, c, n, q, b, s);
    hasCollar = hC;
  }

  public boolean getHasCollar() //change
  {
    return hasCollar;
  }

  public void setHasCollar(boolean i)
  {
    hasCollar = i;
  }

  public String toString()  //change
  {
    return super.toString() + ". Has buttons: " + this.getHasCollar() + ".";
  }
}

