package l4.ebj;


import java.util.Random;
import javax.ejb.Stateless;


@Stateless
public class DataBean implements DataBeanLocal {
    

    @Override
    public int Generowanie() {
        Random rand = new Random();
        int dana = 0;
        
        for(int i=1; i<=10; i++){
            dana = rand.nextInt(10);
        }
        
        return dana;
    }
}
