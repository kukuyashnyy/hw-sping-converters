package org.itstep.domain.enitity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private Date dateOfBirth;
    @NonNull
    private BigDecimal stipendia;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
