class Product
{
    int productId;
    String productName;
    double price;
    static int count;
    Product()
    {
         productName=null;
    }
    Product(int productId,String productName,double price)
    {
            this.productId=productId;
            this.productName=productName;
            this.price=price;
            count++;
    }
    double discount(double Price,double Discount)
    {
              return((100-Discount)/100)*Price;
    }
    void displayProductionInfo()
    {
               System.out.println("Product Id:"+productId);
               System.out.println("Product Name:"+productName);
               System.out.println("Product Price:"+price);
    }
}
class Practical2
{
    public static void main(String[] args)
    {
              Product product1=new Product(101,"Laptop",999.99);
              Product product2=new Product(202,"Smart Phone",499.95);
              Product product3=new Product(303,"Tablet",299.50);
              Product calcDiscount=new Product();

              product1.displayProductionInfo();
              product2.displayProductionInfo();
              product3.displayProductionInfo();

              double DiscountedPrice=calcDiscount.discount(product1.price,10);
              System.out.println("Discounted Price:"+DiscountedPrice);
              System.out.println("Producr.count");
    }
}

