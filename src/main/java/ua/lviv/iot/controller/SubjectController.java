package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.SubjectService;

import javax.security.auth.Subject;
import java.util.List;

@RequestMapping("/subjects")
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Subject createSubject(final @RequestBody Subject subject) {
        return subjectService.createSubject(subject);
    }
}


