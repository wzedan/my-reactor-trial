package reactor.wz.learning.io.repo;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.wz.learning.io.domain.Product;

public interface ProductRepository {
	Mono<Product> getProduct(int id);
	Flux<Product> getAllProducts();
	Mono<Void> saveProduct(Mono<Product> product);
}
