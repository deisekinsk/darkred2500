public class Product {

    private String name;

    public String getName(){
        return  name;
    }

    public void setName (String name){
        // attribute = parameter
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    // equals(Object o) compare objects (o)
    public boolean equals(Object o) {
        Product product = (Product) o;
        return  this.name.equals(product.name);
    }
}
