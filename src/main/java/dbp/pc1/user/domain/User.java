package dbp.pc1.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class User {
    @Id
    private Long id;
    private String nombre;
    private String correo;
    private String contrasena;


}
