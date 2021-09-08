package taskBuilder;

public class User {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
    static class UserBuilder {
        private User user = new User();

        public UserBuilder id(int id) {
            user.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            user.name = name;
            return this;
        }

        public UserBuilder surname(String surname) {
            user.surname = surname;
            return this;
        }

        public UserBuilder age(int age) {
            user.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            user.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            user.phone = phone;
            return this;
        }

        public User build() {
            return user;
        }
    }

}
