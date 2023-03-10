package personal.project.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private String _id;
    private String name, dept;
    private LocalDate enrollmentDate;
    private StudentStatus status;
}
