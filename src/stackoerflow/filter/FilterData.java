package stackoerflow.filter;

import java.util.ArrayList;

public class FilterData {

    public static void main(String[] args) {

        ArrayList<Object> arrayListA = new ArrayList<>();

        arrayListA.add(new Position("ACC1","20-Jan-23","1","open"));
        arrayListA.add(new Position("ACC1","20-Jan-23","2","closing"));
        arrayListA.add(new Position("ACC2","20-Jan-23","1","open"));
        arrayListA.add(new Position("ACC2","20-Jan-23","2","closing"));
        arrayListA.add(new Position("ACC3","20-Jan-23","1","open"));
        arrayListA.add(new Position("ACC3","20-Jan-23","2","closing"));

        ArrayList<Object> arrayListB = new ArrayList<>();

        arrayListB.add(new Position("ACC1","20-Jan-23","1","open"));
        arrayListB.add(new Position("ACC1","20-Jan-23","2","closing"));
        arrayListB.add(new Position("ACC2","20-Jan-23","1","open"));
        arrayListB.add(new Position("ACC2","20-Jan-23","2","closed"));
        arrayListB.add(new Position("ACC3","20-Jan-23","1","open"));

    }
}

