package guru.springframework.msscbrewery.web.model;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.BeerDto.BeerDtoBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

	private UUID id;
	private String customerName;

}
