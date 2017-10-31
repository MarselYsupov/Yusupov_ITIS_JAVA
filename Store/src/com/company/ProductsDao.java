package com.company;

import java.io.IOException;

public interface ProductsDao {
    boolean exists(String product) throws IOException;

    void add(String product) throws IOException;

    /**
     * Удаляет конкретный продукт
     * @param product название продукта, который надо удалить
     */
    void remove(String product) throws IOException;

    /**
     * Заменяет один продукт на другой
     * @param product1 продукт, который будет заменен
     * @param product2 продукт, который заменит первый продукт
     */
    void replace(String product1, String product2) throws IOException;
}