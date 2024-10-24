package preznyak.udemy.msscbeerservice.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import preznyak.udemy.msscbeerservice.domain.Beer;
import preznyak.udemy.msscbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        if (beerRepository.count() == 0) {
            loadBeerObjects();
        }
    }

    private void loadBeerObjects() {
        Beer beer1 = Beer.builder()
                .upc(BEER_1_UPC)
                .beerName("Mango Bobs")
                .beerStyle("IPA")
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .version(1L)
                .build();

        Beer beer2 = Beer.builder()
                .upc(BEER_2_UPC)
                .beerName("Galaxy Cat")
                .beerStyle("PALE_ALE")
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .version(1L)
                .build();

        Beer beer3 = Beer.builder()
                .upc(BEER_3_UPC)
                .beerName("Pinball Porter")
                .beerStyle("PORTER")
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .version(1L)
                .build();

        beerRepository.saveAll(List.of(beer2, beer1, beer3));
    }

}
