package dbp.pc1.user.infrastructure;

import dbp.pc1.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
