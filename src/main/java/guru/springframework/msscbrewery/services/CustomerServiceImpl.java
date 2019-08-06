package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID()).customerName("Joe's Bar").build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		customerDto.setId(UUID.randomUUID());
		return customerDto;
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		// TODO Auto-generated method stub
		
	}

}
