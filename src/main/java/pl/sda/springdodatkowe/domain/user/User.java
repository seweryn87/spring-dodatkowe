package pl.sda.springdodatkowe.domain.user;

import lombok.Getter;
import lombok.Setter;
import pl.sda.springdodatkowe.domain.address.Address;
import pl.sda.springdodatkowe.domain.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MY_USERS")
@Getter
@Setter
public class User extends BaseEntity {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String login;

    private String password;

    @ManyToMany
    @JoinTable(name = "users_addresses",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "address_id")})
    private List<Address> addresses;
}
