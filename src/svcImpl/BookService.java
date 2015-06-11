/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svcImpl;

import injectInterface.Book;
import model.Product;

/**
 *
 * @author Administrator
 */
@Book
public class BookService extends BaseProductServiceImpl{

    @Override
    public Product getNewProduct() {
        product.setProductName("程序员的自我修养");
        product.setProductNo("SINO 9999");
        return product;
    }
    
}
