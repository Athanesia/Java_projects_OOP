import java.util.ArrayList;
import java.util.List;

/**
 * Класс Basket представляет корзину пользователя, в которую можно добавлять продукты.
 * Класс реализует функции добавления и удаления продуктов из корзины, а также расчета общей суммы продуктов.
 */
public class Basket {
    /**
     * Список продуктов, добавленных в корзину.
     */
    private List<Product> products;
    
    /**
     * Создает новую пустую корзину.
     */
    public Basket() {
        this.products = new ArrayList<>();
    }

    /**
    Возвращает список продуктов, добавленных в корзину.
    @return список продуктов в корзине
    */
    public List<Product> getProducts() {
        return products;
    }
    
    /**
     * Добавляет продукт в корзину.
     *
     * @param product добавляемый продукт
     */
    public void addProduct(Product product) {
        products.add(product);
    }
    
    /**
    Удаляет продукт из корзины по его названию.
    @param productName название удаляемого продукта
    */
    public void removeProduct(String productName) {
        products.removeIf(p -> p.getName().equals(productName));
    }
}