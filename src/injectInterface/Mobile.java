/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package injectInterface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/**
 *
 * @author Administrator
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Mobile {
    
}
