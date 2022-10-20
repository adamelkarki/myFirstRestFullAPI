package com.project.myFirstRestFullAPI;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "learn Spanish", "Luis Diaz"),
                new Course(2, "learn English", "Jordan Henderson")
        );
    }
}
