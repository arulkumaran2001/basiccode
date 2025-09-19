package collectionclass;

import java.util.Comparator;

public class comparitor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        laptop l1= (laptop) o1;
        laptop l2=(laptop)o2;
        int com= l1.brand.compareTo(l2.brand);
        if (com>0)
            return 2;
        else if (com<0) {
            return  -2;
        }
        else
            if (l1.price>l2.price)
                return 1;
            else if (l1.price<l2.price)
                return -549783;
            return 0;
    }
}
