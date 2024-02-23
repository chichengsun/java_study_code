package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
}
