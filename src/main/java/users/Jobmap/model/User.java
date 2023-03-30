package users.Jobmap.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
@Entity
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@SuperBuilder
@ToString
@AllArgsConstructor
@Table(name = "user_table")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String secondName;
    @Column(nullable = false)
    private String State;
    @Column(nullable = false)
    private String city;

    public User(String name, String email, String secondName, String state, String city) {
        this.name = name;
        this.email = email;
        this.secondName = secondName;
        State = state;
        this.city = city;
    }
}
