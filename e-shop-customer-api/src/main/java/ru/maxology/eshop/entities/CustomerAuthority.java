package ru.maxology.eshop.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ru.maxology.eshop.entities.AuthorityValues;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAuthority implements GrantedAuthority {


    private String authority = AuthorityValues.CUSTOMER.name();

    private CustomerAuthority(){super();}

    public CustomerAuthority(AuthorityValues authority){
        super();
        this.authority = authority.name();
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerAuthority)) return false;
        CustomerAuthority that = (CustomerAuthority) o;
        return authority.equals(that.getAuthority());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthority());
    }
}
