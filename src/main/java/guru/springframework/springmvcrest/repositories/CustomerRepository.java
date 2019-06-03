package guru.springframework.springmvcrest.repositories;

import guru.springframework.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
