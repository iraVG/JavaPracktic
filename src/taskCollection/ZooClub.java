package taskCollection;
//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В мейн методі створити меню, яке буде реалізовувати наступні функції:
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class ZooClub {

    private Map<Person, List<Pet>> club = new HashMap<>();

    public ZooClub() {
    }

    public ZooClub(Person person, Pet... pets) {
        List<Pet> emptyPetList = new ArrayList<>();
        for (Pet pet : pets) {
            emptyPetList.add(pet);
        }
        this.club.put(person,emptyPetList);
    }
    public void addX(Person person, Pet... pets) {
        List<Pet> emptyPetList = new ArrayList<>();
        for (Pet pet : pets) {
            emptyPetList.add(pet);
        }
        this.club.put(person,emptyPetList);
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
