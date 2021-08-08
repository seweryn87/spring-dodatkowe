package pl.sda.springdodatkowe.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.springdodatkowe.domain.user.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User  getUserByLogin(String login);

    List<User> getUserByLastName(String lastName);

    @Query("SELECT u from User u join fetch u.addresses")
    User getUserFetchJoinAddresses(String login);
}
