package taskBuilder;

public class Auto {
    private String model;
    private int id;
    private String engine;
    private int powerEngine;
   // private String []carWheel=new String[4];

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", engine='" + engine + '\'' +
                ", powerEngine=" + powerEngine +
                '}';
    }

    public static AutoBuilder builder() {
        return new AutoBuilder();
    }

    static class AutoBuilder {
        private Auto auto = new Auto();

        public AutoBuilder id(int id) {
            auto.id = id;
            return this;
        }

        public AutoBuilder model(String model) {
            auto.model = model;
            return this;
        }

        public AutoBuilder engine(String engine) {
            auto.engine = engine;
            return this;
        }

//        public AutoBuilder carWheel(String carWheel[]) {
//            auto.carWheel = carWheel;
//            return this;
//        }

        public AutoBuilder powerEngine(int powerEngine) {
            auto.powerEngine = powerEngine;
            return this;
        }

        public Auto build() {
            return auto;
        }
    }
}
