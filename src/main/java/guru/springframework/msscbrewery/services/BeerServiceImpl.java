package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Coors Lite").beerStyle("lager").build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return beerDto.builder().id(UUID.randomUUID()).build();
	}

}
