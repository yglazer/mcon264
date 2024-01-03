package yg;

		import java.util.Comparator;

		public class LineComparatorShopper implements Comparator<Shopper> {

		    @Override
		    public int compare(Shopper o1, Shopper o2) {
		        int diff = Integer.compare(o1.getTotalPurchaseValue(),o2.getTotalPurchaseValue());
		        
		        System.out.println(diff);
		        if (diff == 0) {
		            diff = Integer.compare(o1.getTime(), o2.getTime());
		        }
		        return diff;
		    }
		}