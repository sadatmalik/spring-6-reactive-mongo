package com.creativefusion.spring6reactivemongo.web.fn;

import com.creativefusion.spring6reactivemongo.model.BeerDTO;
import com.creativefusion.spring6reactivemongo.services.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author sm@creativefusion.net
 */
@Component
@RequiredArgsConstructor
public class BeerHandler {
    private final BeerService beerService;

    public Mono<ServerResponse> getBeerById(ServerRequest request){
        return ServerResponse
                .ok()
                .body(beerService.getById(request.pathVariable("beerId")), BeerDTO.class);
    }

    public Mono<ServerResponse> listBeers(ServerRequest request){
        return ServerResponse.ok()
                .body(beerService.listBeers(), BeerDTO.class);
    }
}
