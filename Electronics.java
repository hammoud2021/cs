public class Electronics extends Product
{
  private String color; 
  private boolean batteryIncluded;

  public Electronics()  
  {
    super(99.99, "Samsung", "Phone", 1);
    color = "Black";
    batteryIncluded = true;
  }

  public Electronics(double p, String c, String n, int q, String col, boolean bI)
  {
    super(p, c, n, q);
    color = col;
    batteryIncluded = bI;
  }

  public String getColor()
  {
    return color;
  }

  public boolean getBatteryIncluded()
  {
    return batteryIncluded;
  }

  public void setColor(String c)
  {
    color = c;
  }

  public void setBatteryIncluded(boolean b)
  {
    batteryIncluded = b;
  }

  public String toString()
  {

    return super.toString() + " in the color " + this.getColor() + ". Battery included: " + this.getBatteryIncluded() + ".";
  }
}

