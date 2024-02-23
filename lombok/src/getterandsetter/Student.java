package getterandsetter;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Student {
    /*
    也可以单独为某一个字段天剑getter和setter
     */
    @NonNull
    private String name;
    private Integer age;
    private String address;

}
