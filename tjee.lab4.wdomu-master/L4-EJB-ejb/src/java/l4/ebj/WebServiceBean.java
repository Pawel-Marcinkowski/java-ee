package l4.ebj;

import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@Singleton
@LocalBean
@WebService(serviceName = "DataSOAP")
public class WebServiceBean {

    @WebMethod(operationName = "wyswietl")
    public String wyswietl(@WebParam(name = "name") int dana1, int dana2, int dana3, int dana4) {
        String histogram = "<br>";
        int dane[] = {dana1, dana2, dana3, dana4};
        for(int i=0; i<=3; i++){
            histogram += i+1 + "|";
            for(int j=1; j<=dane[i]; j++){
                histogram += "[]";
            }
            histogram += "<br>";
        }
        return histogram;
    }
}
