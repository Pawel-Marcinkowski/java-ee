/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.ebj;

import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class SessionBean implements SessionBeanRemote {

  private String OstatnieDane;
  private Date OstatniDostep;
    
    @Override
    public String getOstatnieDane() {
        return OstatniDostep + "\n" + OstatnieDane;
    }
    
    @Override
    public void setOstatnieDane(String dane, Date data) {
        OstatnieDane = dane;
        OstatniDostep = data;
    }
}
