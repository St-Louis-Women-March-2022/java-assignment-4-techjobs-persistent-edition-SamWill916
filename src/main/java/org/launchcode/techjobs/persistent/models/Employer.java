package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min=4, max=100)
    public String location;

    public Employer(){
    }

    //needed to create .setLocation method to pass test
    public void setLocation(String location) {
        this.location = location;
    }


//employer class has no getLocation method! Need to put it in
    public String getLocation() {
        return location;
    }
//initialized to List<Job> empty arraylist - will represent list of all items in a given job
    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

}
