import java.text.*;
import java.util.*;

class Main {

  public static double productCost(Product n)
  {
    double pc = n.getPrice() * n.getQuantity();
    return pc;
  }

  public static double grandTotal(Product[] r)
  {
    double gt = 0.0;
    for (Product od : r)
    {
      gt += (od.getPrice() * od.getQuantity());
    }
    return gt;
  }
 
  public static void main(String[] args)
  {
    //instantiate Product array


    Product[] products = new Product[6];
   
    // this is where you instantiate object from each class
   Product p = new Product(1.49, "Kraft", "Cheese Slices", ((int)(Math.random()*4)+3));
    Media m = new Media(9.99, "Shonen", "Black Clover", ((int)(Math.random()*4)+3), "Manga");
    Electronics e = new Electronics(549.99, "Microsoft", "Xbox Series X", ((int)(Math.random()*4)+3), "black", false);
    Clothing c = new Clothing(29.99, "Nike", "shirt", ((int)(Math.random()*4)+3), "Jordan", "medium");
    Men mn= new Men(199.99, "Hollister", "Jacket", ((int)(Math.random()*4)+3), "Macy's", "large", false);
    Women w = new Women(999.99, "Gucci", "Belt", ((int)(Math.random()*4)+3), "Kering", "medium", "fancy");

    //populate array

    products[0] = p;
    products[1] = m;
    products[2] = e;
    products[3] = c;
    products[4] = mn;
    products[5] = w;

    
    for (Product x : products)
    {
      System.out.println(x + "\n");
    }
    System.out.println("--------------------------------------------------------------");



    NumberFormat nf=NumberFormat.getCurrencyInstance();
    String fmt = "%1$20s %2$20s %3$15s %4$15s %5$15s";
    System.out.printf(fmt, "Name", "Company", "Quantity" , "Price", "Total Cost\n");
    System.out.println("***********************************************************************");

    for(int i = 0; i<products.length; i++)
    {
      System.out.printf(fmt, products[i].getName() , products[i].getCompany() , products[i].getQuantity(), nf.format(products[i].getPrice()), nf.format(productCost(products[i])));
     
      System.out.println();
    }
    System.out.println("************************************************************");
    System.out.printf("Grand Total%20s" , nf.format(grandTotal(products)));


  }
}

