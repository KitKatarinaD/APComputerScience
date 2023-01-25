package Q2;

public class CarClass {
        private int myID;
        private String myMake;
        private String myModel;
        private int myYear;

        public CarClass(int id, String make, String model, int year) {
            myID = id;
            myMake = make;
            myModel = model;
            myYear = year;
        }

        public int getID() { return myID; }
        public String getMake() { return myMake; }
        public String getModel() { return myModel; }
        public int getYear() { return myYear;};
}
