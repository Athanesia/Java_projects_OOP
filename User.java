/**
 * Класс User представляет пользователя системы, который может авторизоваться, изменять свой логин и пароль,
 * а также управлять своей корзиной с продуктами.
 */
public class User {
    /**
     * Логин пользователя.
     */
    private String login;
    
    /**
     * Пароль пользователя.
     */
    private String password;
    
    /**
     * Корзина пользователя.
     */
    private Basket basket;
    
    /**
     * Создает нового пользователя с заданным логином и паролем и создает для него пустую корзину.
     *
     * @param login    логин пользователя
     * @param password пароль пользователя
     */
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }
    
    /**
     * Возвращает логин пользователя.
     *
     * @return логин пользователя
     */
    public String getLogin() {
        return login;
    }
    
    /**
     * Устанавливает логин пользователя.
     *
     * @param login новый логин пользователя
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * Возвращает пароль пользователя.
     *
     * @return пароль пользователя
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Устанавливает пароль пользователя.
     *
     * @param password новый пароль пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Возвращает корзину пользователя.
     *
     * @return корзина пользователя
     */
    public Basket getBasket() {
        return basket;
    }
}