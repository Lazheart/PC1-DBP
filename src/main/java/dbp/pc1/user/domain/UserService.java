package dbp.pc1.user.domain;

import dbp.pc1.user.infrastructure.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return  userRepository.findById(id).orElse(null);
    }
}

