/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import injectInterface.Book;
import injectInterface.Mobile;
import javax.inject.Inject;
import svcInterface.IProductService;

/**
 *
 * @author Administrator
 */
public class productController {
    
    @Inject
    @Book
    IProductService bookService;
    
    @Inject
    @Mobile
    IProductService mobileService;
    
    public IProductService  getBookService (){
        return bookService;
    }
    
    public IProductService getMobileService(){
        return mobileService;
    }
    
    
}
