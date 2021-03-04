public class Main {
    public static void main(String[] args) {


        Person nguoi1 = new Person("thanh", 90, "thai  binh");
        Person nguoi2 = new Person("thanh", 10, "thai  binh");
        Person nguoi3 = new Person("thanh", 80, "thai  binh");
        HoGiaDinh hoGiaDinh1 = new HoGiaDinh(nguoi1, 10, 5);
        HoGiaDinh hoGiaDinh2 = new HoGiaDinh(nguoi2, 10, 5);
        HoGiaDinh hoGiaDinh3 = new HoGiaDinh(nguoi3, 10, 23);
        KhuPho quanly = new KhuPho();
        quanly.Add(hoGiaDinh1);
        quanly.Add(hoGiaDinh2);
        quanly.Add(hoGiaDinh3);
        quanly.findOldPerson();

    }
}
