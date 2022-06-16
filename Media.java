public class Media extends Product
{
  private String type;

  public Media()  
  {
    super(14.99, "Toei", "One Piece", 1);
    type = "Anime";
  }

  public Media(double p, String c, String n, int q, String t)
  {
    super(p, c, n, q);
    type = t;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String t)
  {
    type = t;
  }

  public String toString() 
  {
    return super.toString() + ". This is a(n) " + this.getType() + ".";
  }
 
}

