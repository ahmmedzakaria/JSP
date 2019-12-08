
package com.bari.javaknowledge;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

@ManagedBean
@ApplicationScoped
public class Person extends Programmer {

    /** Creates a new instance of Person */
    public Person() {
        super("Mr.", "Bari", "Senior",
                "HTML", "CSS", "JavaScript", "Oracle","Java","XML","Android");
    }
}
