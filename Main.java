import java.util.ArrayList;

public class Main {
    //объявление списка категорий
    private static ArrayList<Category> categories = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        //Создаем категории
        Category laptops = new Category("Ноутбуки");
        laptops.addProduct(new Product("Macbook Air", 109000, 4.5));
        laptops.addProduct(new Product("Dell XPS 13", 64000, 4.7));
        laptops.addProduct(new Product("Lenovo ThinkPad X1 Carbon", 252990, 4.6));
        categories.add(laptops);

        Category phones = new Category("Телефоны");
        phones.addProduct(new Product("iPhone 13", 99990, 4.8));
        phones.addProduct(new Product("Samsung Galaxy S21", 64990, 4.7));
        phones.addProduct(new Product("Google Pixel 6", 36490, 4.5));
        categories.add(phones);

        Category tablets = new Category("Планшеты");
        tablets.addProduct(new Product("iPad Pro", 84990, 4.8));
        tablets.addProduct(new Product("Samsung Galaxy Tab S7", 56999, 4.6));
        tablets.addProduct(new Product("Lenovo Tab P11 Pro", 25999, 4.5));
        categories.add(tablets);

         /**
         * Выводим каталог товаров
         */
        System.out.println("Каталог товаров:");
        for (Category category : categories) {
            System.out.println(category.getName());
            for (Product product : category.getProducts()) {
                System.out.printf("\t%s - %.2f руб., рейтинг %.1f\n", product.getName(), product.getPrice(), product.getRating());
            }
        }

        // Создаем пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        users.add(user1);
        users.add(user2);
 
         // Добавляем продукты в корзину пользователей
        user1.getBasket().addProduct(laptops.getProductByName("Dell XPS 13"));
        user1.getBasket().addProduct(phones.getProductByName("iPhone 13"));
        user2.getBasket().addProduct(tablets.getProductByName("Samsung Galaxy Tab S7"));

        // Удаляем продукты из категории после покупки
        laptops.removeProduct("Dell XPS 13");
        phones.removeProduct("iPhone 13");
        tablets.removeProduct("Samsung Galaxy Tab S7");

        // Выводим покупки пользователей
        System.out.println("\nПокупки пользователей:");
        System.out.println(user1.getLogin() + ":");
        for (Product product : user1.getBasket().getProducts()) {
            System.out.printf("\t%s - %.2f руб., рейтинг %.1f\n", product.getName(), product.getPrice(), product.getRating());
        }
        System.out.println(user2.getLogin() + ":");
        for (Product product : user2.getBasket().getProducts()) {
            System.out.printf("\t%s - %.2f руб., рейтинг %.1f\n", product.getName(), product.getPrice(), product.getRating());
        }
    }
}

class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}