package in.raj.config;

import in.raj.entity.Customer;
import org.springframework.batch.item.ItemProcessor;


public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer item) throws Exception {
        // Logic to process data
/*        if (item.getCountry().equals("India")){
            return item;
        }
        return null;*/
        return item;
    }


}
