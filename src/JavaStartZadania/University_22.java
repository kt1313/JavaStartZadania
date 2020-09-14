package JavaStartZadania;

class University_22 {
    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisami: " + Student_22.getStudentsNumber());
        Student_22 s1 = new Student_22("Jan", "Kowalski", 179304);
        Student_22 s2 = new Student_22("Marek", "Jarosz", 176532);
        System.out.println("Liczba studentów po zapisach: " + Student_22.getStudentsNumber());
    }
}
