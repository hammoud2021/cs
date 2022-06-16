//file name is Women
public class Women extends Clothing
{
  private String style; 

  public Women()  
  {
    super();
    style = "fancy";
  }

  public Women(double p, String c, String n, int q, String b, String s, String st)
  {
    super(p, c, n, q, b, s);
    style = st;
  }

  public String getStyle()
  {
    return style;
  }

  public void setSize(String st)
  {
    style = st;
  }

  public String toString() //change
  {
    return super.toString() + " and style " + this.getStyle() + ".";
  }
}
