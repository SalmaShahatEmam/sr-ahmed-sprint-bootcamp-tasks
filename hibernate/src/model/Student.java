package model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import util.studentUtil;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="f_name")
    private String first_name;

    @Column(name="l_name")
    private String last_name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "join_date")
    private Date join_date;

    @Transient
    private studentUtil studentUtil;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", join_date='" + join_date + '\'' +
                '}';
    }
}
