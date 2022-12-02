package testings;

public class SampathCodeTwo {

    public static void main(String[] args) {
        Boolean t = false;
        try {
            if (t) {
                while (true) {
//                    System.out.println(t);
//                    break;  // there was nothing in while loop at the test so the system will run forever (running forever because there is no break)
                }
            } else {
                System.exit(1);
            }
        } finally {
            System.out.println("I am running!!!");
        }
    }
}
