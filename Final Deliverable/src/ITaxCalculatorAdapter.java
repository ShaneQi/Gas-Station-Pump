
import java.util.*;

/**
 * 
 */
public interface ITaxCalculatorAdapter {

    /**
     * @param total_price
     * @return 
     */
    public TaxLineItem getTaxes(SalesLineItem salesLineItem);

}