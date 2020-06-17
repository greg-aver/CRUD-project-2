package model;

import lombok.*;

@Data
@AllArgsConstructor
public class User {

    @Setter(AccessLevel.NONE)
    private int id;
    @NonNull private String name;
    @NonNull private String surname;
    @NonNull private int age;

    public User(@NonNull String name, @NonNull String surname, @NonNull int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
