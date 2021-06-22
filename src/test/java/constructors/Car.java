package constructors;

    public class Car {

        String model;
        int maxSpeed;

        public static void main(String[] args) {
            Car bugatti = new Car("Bugatti Veyron", 407);
            System.out.println(bugatti.model);
            System.out.println(bugatti.maxSpeed);
        }

        public Car(String model, int maxSpeed) {
            this.model = model;
            this.maxSpeed = maxSpeed;
        }
    }


