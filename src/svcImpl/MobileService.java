/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svcImpl;

import injectInterface.Mobile;
import model.Product;

/**
 *
 * @author Administrator
 */
@Mobile
public class MobileService  extends BaseProductServiceImpl{

    @Override
    public Product getNewProduct() {
        product.setProductName("iphone");
        product.setProductNo("6");
        return product;
    }
    
}
