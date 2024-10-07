package ru.hogwarts.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

public interface FacultyService {
 Faculty addStudent(Faculty faculty);
    Faculty findFaculty(long id);
    Faculty editFaculty(long id, Faculty faculty);
    void deleteFaculty(long id);
}
