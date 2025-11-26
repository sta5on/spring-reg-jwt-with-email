package sta5on.springregjwtemailconfirm.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sta5on.springregjwtemailconfirm.Model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findVerificationCode(String verificationCode);


}
