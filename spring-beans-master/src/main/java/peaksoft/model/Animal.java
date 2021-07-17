package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {

    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;

}
