package taskBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Main {
    public static void main(String[] args) {
        User kokos = User.builder()
                .age(33)
             //   .email("kkkk@uk.com")
                .id(12)
                .name("kokos")
               // .phone("2344477")
                .surname("palma")
                .build();
        System.out.println(kokos);
//        Auto mazda=Auto.builder()
//                .engine("kk123")
//                .id(33)
//                .model("cx700")
//                .powerEngine(160)
//                .build();
//        System.out.println(mazda);


    }
}






//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//class User{
//    private String name;
//}
