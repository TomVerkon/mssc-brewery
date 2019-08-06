package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Coors Lite").beerStyle("lager").build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		beerDto.setId(UUID.randomUUID());
		return beerDto;
	}

	@Override
	public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBeerById(UUID beerId) {
		log.debug("Deleting beer with ID: " + beerId);
	}

}
