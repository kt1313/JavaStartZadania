package JavaStartZadania;

class Hospital_31 {
    private static final int ARRAY_SIZE = 3;
    HospPerson_31[] hospital = new HospPerson_31[ARRAY_SIZE];
    //HospPerson_31 person = new HospPerson_31();
    private int employeeNumber = 0;

    public void add(HospPerson_31 person) {
        if(employeeNumber < ARRAY_SIZE) {
            hospital[employeeNumber] = person;
            employeeNumber++;
        }
    }

String getInfo(){
        String result = "";
    for (int i = 0; i < employeeNumber; i++) {
        result = result + hospital[i].getInfo() + "\n";
    }
    return result;
}

}
