package ru.maxology.eshop.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import ru.maxology.eshop.entities.Customer;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {
    public Optional<Customer> findByEmail(String email) {
        return find("email", email).firstResultOptional();
    }

    public List<Customer> listActive() {
        return list("verified", true);
    }
}
