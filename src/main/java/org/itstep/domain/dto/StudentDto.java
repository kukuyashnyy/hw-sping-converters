package org.itstep.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.itstep.domain.enitity.Gender;
import org.itstep.domain.enitity.Student;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class StudentDto {
    private int id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String dateOfBirth;

    private String stipendia;

    private String gender;

    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Student toEntity() throws ParseException {
        return new Student(id, firstName, lastName, dateFormat.parse(dateOfBirth),
                new BigDecimal(stipendia), Gender.valueOf(gender));
    }
}
