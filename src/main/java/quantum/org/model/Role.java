package quantum.org.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
