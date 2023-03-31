import java.util.ArrayList;
import java.util.List;

/**
 * Класс Category представляет категорию продуктов в магазине.
 * Класс реализует функции добавления и удаления продуктов в категорию, а также поиска продуктов по имени.
 */
public class Category {
    private String name;
    private List<Product> products;
    
    /**
     * Конструктор класса Category.
     * 
     * @param name название категории.
     */
    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }
    
      /**
     * Возвращает название категории.
     * 
     * @return название категории.
     */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Возвращает список продуктов, которые относятся к категории.
     * 
     * @return список продуктов категории.
     */
    public List<Product> getProducts() {
        return products;
    }
    
    /**
     * Добавляет продукт в категорию.
     * 
     * @param product продукт, который нужно добавить.
     */
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void removeProduct(String productName) {
        products.removeIf(p -> p.getName().equals(productName));
    }
    
    /**
     * Возвращает список продуктов с заданным названием, которые относятся к категории.
     * 
     * @param name название продукта.
     * @return список продуктов с заданным названием.
     */
    public Product getProductByName(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}