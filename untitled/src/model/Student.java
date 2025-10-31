package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="f_name")
    private String first_name;

    @Column(name="l_name")
    private String last_name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
