package pl.sda.springdodatkowe.domain.address;


import lombok.Getter;
import lombok.Setter;
import pl.sda.springdodatkowe.domain.common.BaseEntity;
import pl.sda.springdodatkowe.domain.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MY_ADDRESSES")
@Getter
@Setter
public class Address extends BaseEntity {

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String postalCode;


    @ManyToMany(mappedBy = "addresses")
    private List<User> users;
}
