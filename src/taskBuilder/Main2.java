//package taskBuilder;
//import lombok.Builder;
//
//public class Main2{
//    public static void main(String[] args){
//        Car mashina=Car.builder()
//                .mark("Toyota")
//                .power(300)
//                .owner("Steve")
//                .year(1998)
//                .price(27 000).build();
//        System.out.println(mashina);
//    }
//}
//@Builder
//class Car{
//    private String mark;
//    private int power;
//    private String owner;
//    private int year;
//    private int price;
////v kinci
////   public static CarBuilder builder(){
//return new CarBuilder();
//}
//    @Override
//    public String toString(){
//        return "Car{" +
//                "mark=" + mark +
//                ", power=" + power +
//                ", owner=" + owner +
//                ", year=" + year +
//                ", price=" + price +
//                '\''+
//                '}';
//    }
//static class CarBuilder{
//    private Car user=new Car();
//
//    public CarBuilderid (String mark){
//        user.mark=mark;
//        return this;
//    }
//    public CarBuilderid (int power){
//        user.power=power;
//        return this;
//    }
//    public CarBuilderid (String owner){
//        user.owner=owner;
//        return this;
//    }
//    public CarBuildername (String year){
//        user.year=year;
//        return this;
//    }
//    public CarBuildername (String email{
//        user.price=price;
//        return this;
//    }
//    public Car build(){
//        returt this;}
//}
