package com.kshtriya.youtube.LearningRestAPIs.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // we dont need to write the Constructoe,getter and setter
@AllArgsConstructor  // make a construvtor with all arguments
@NoArgsConstructor
public class StudentDto {
    private long id;
    private String name;
    private String email;



    public StudentDto(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public StudentDto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
