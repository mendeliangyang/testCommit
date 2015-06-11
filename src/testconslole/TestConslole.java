/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconslole;

import com.ebj.ToConverterRemote;
import controller.productController;
import java.util.Properties;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.Product;
import svcInterface.IProductService;

/**
 *
 * @author Administrator
 */
public class TestConslole {

    @EJB
    private static ToConverterRemote convert;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        // TODO code application logic here

       // InitialContext ctx = new InitialContext();
        //convert = (ToConverterRemote) ctx.lookup("com.ebj.ToConverterRemote");
        
        
        //Properties props = System.getProperties();
        //props.setProperty("ava.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
        //props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost:8080");
        //InitialContext ctx = new InitialContext(props);
        //convert = (ToConverterRemote) ctx.lookup("ejbDemo-ejb/ToConverter");
        
       // convert =  (ToConverterRemote)InitialContext.lookup("java:module/ExampleBean");

       // String lowerStr = convert.ToLowerCase("hw");
        String lowerStr = "hw";
        System.out.println(lowerStr);
        
        
         
        //测试Inject
        productController controller = new productController();
        Product bookService= controller.getBookService().getNewProduct();
        System.out.println(bookService.toString());
        IProductService mobileService= controller.getBookService();
        System.out.println(mobileService.toString());
        
    }

}
