import java.util.Objects;

public class Product {

private String name_product;
private Double cost;

public Product (String name_product,double cost) {
    this.name_product=name_product;
    this.cost=cost;

}

    public String getName_product() {
        return name_product;
    }

     public void setName_product(String name_product) {
    this.name_product = name_product;
   }

   public Double getCost() {
         return cost;
   }
//Переопределяем параметр name_product в строку
    @Override
    public String toString() {
        return "Product{" +
                "name_product='" + name_product + '\'' +
                '}';
    }
//Переопределяем equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name_product, product.name_product);
    }
//Переопределяем хэшкод
    @Override
    public int hashCode() {
        return Objects.hashCode(name_product);
    }

    // public void setCost(Double cost) {
    //    this.cost = cost;
  //  }
}

