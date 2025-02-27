public class Product {

    private String name;

    //construtor getter setter toString()
    public Product(String nameProduct) {
        this.name = nameProduct;
    }

    public String getName(){
        return  name;
    }

    public void setName (String name){
        // attribute = parameter
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    // equals(Object o) compare objects (o)
    public boolean equals(Object o) {
        Product product = (Product) o;
        return  this.name.equals(product.name);
    }

    @Override
    public int hashCode(){
        return name != null ? name.hashCode() : 0;

    }
}
