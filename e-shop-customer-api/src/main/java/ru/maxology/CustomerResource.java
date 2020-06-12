package ru.maxology;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import ru.maxology.eshop.entities.Customer;
import ru.maxology.eshop.entities.CustomerAuthority;
import ru.maxology.eshop.repository.CustomerRepository;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {
    @Inject
    CustomerRepository customerRepository;
    @GET
    public List<Customer> list() {
        return customerRepository.listActive();
    }

}
