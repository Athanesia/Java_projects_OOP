/**
 * Класс, представляющий продукт.
 */
public class Product {
    private String name;
    private double price;
    private Category category;

    /**
     * Конструктор класса Product.
     * 
     * @param name     название продукта.
     * @param price    цена продукта.
     * @param category категория, к которой относится продукт.
     */
    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    /**
     * Возвращает название продукта.
     * 
     * @return название продукта.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает цену продукта.
     * 
     * @return цена продукта.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Возвращает категорию, к которой относится продукт.
     * 
     * @return категория продукта.
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Задает новую цену продукта.
     * 
     * @param price новая цена продукта.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}