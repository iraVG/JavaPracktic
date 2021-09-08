package less_Observable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MeteoStation meteoStation = new MeteoStation();
        meteoStation.changeTempAndDoNotify(7);
    }
}


@Setter
@Getter
@ToString
@EqualsAndHashCode
class User{
    private String name;
    private String typeOfShoe;

    public User(String name){
        this.name=name;
    }
    public void whichShoeChoose(int temp){
        if(temp<=0){
            this.typeOfShoe="winter shoe";
            System.out.println(this);
        }else if(temp>0&&temp<17){
            this.typeOfShoe="autumn shoe";
            System.out.println(this);
        }else{
            this.typeOfShoe="summer shoe";
            System.out.println(this);
        }
    }
}

class MeteoStation{
    private int temp;
    private List<User> subscribers;

    public MeteoStation(){
        subscribers=new ArrayList<>();
        subscribers.add(new User("vanja"));
        subscribers.add(new User("vasja"));
        subscribers.add(new User("vika"));
        subscribers.add(new User("olga"));
        subscribers.add(new User("oleg"));
    }
    public void addSubscriber(User user){
        subscribers.add(user);
    }

    public void removeSubscriber(User user){
        subscribers.remove(user);
    }

    public  void changeTempAndDoNotify(int newTemp){
        this.temp=newTemp;
        for (User subscriber : subscribers) {
            subscriber.whichShoeChoose(temp);
        }
    }

}
