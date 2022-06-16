public class Product
{
  private double price;
  private String company;
  private String name;
  private int quantity;

  public Product() 
  {
    price = 9.99;
    company = "Nike";
    name = "Shoes";
    quantity = 2;
  }
  public Product(double p, String c, String n, int q)
  {
    price = p;
    company = c;
    name = n;
    quantity = q;
  }

  public double getPrice()
  {
    return price;
  }

  public String getCompany()
  {
    return company;
  }

  public String getName()
  {
    return name;
  }
 
  public int getQuantity()
  {
    return quantity;
  }
 
  public void setPrice(double d)
  {
    price = d;
  }

  public void setCompany(String s)
  {
    company = s;
  }
 
  public void setName(String s)
  {
    name = s;
  }
 
  public void setQuantity(int x)
  {
    quantity = x;
  }
 
  public String toString()
  {

    String rv = this.getQuantity() + " " + this.getCompany() + " " + this.getName() + " for $" + this.getPrice() + " each one";
    return rv;
  }

}


