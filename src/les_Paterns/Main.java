package les_Paterns;

import lombok.Builder;

public class Main {
    public static void main(String[] args) {
User vova=User.builder()
        .email("iii@u.ua")
        .id(22)
        .name("vova")
        .build();
        System.out.println(vova);
    }
}
@Builder
class User {
    private int id;
    private String name;
    private String email;

//    public static UserBuilder builder(){
//        return new UserBuilder();
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

//    static class UserBuilder {
//        private User user = new User();
//
//        public UserBuilder id(int id) {
//            user.id = id;
//            return this;
//        }
//
//        public UserBuilder name(String name) {
//            user.name = name;
//            return this;
//        }
//
//        public UserBuilder email(String email) {
//            user.email = email;
//            return this;
//        }
//
//        public User build() {
//            return user;
//        }

 //  }
}
