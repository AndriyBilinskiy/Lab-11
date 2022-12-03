import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@ToString
public class User extends Human{
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    private List<String> occupation;
}