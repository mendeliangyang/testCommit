/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svcImpl;

import javax.inject.Inject;
import model.Product;
import svcInterface.IProductService;

/**
 *
 * @author Administrator
 */
public abstract  class BaseProductServiceImpl implements IProductService{
    
    @Inject
    protected  Product product;
    
    public abstract Product getNewProduct();
}
