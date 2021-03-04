import java.util.ArrayList;
public class KhuPho {
    ArrayList<HoGiaDinh> listPerson = new ArrayList<>();
    ArrayList<HoGiaDinh> listOldPerson = new ArrayList<>();
    public void Add(HoGiaDinh object) {
        listPerson.add(object);
    }
    public void findOldPerson() {
        for (HoGiaDinh hoGiaDinh : listPerson) {
            if (hoGiaDinh.getPerson().getAge() >= 80) {
                listOldPerson.add(hoGiaDinh);
                System.out.println(listOldPerson.toString());
            }
        }
    }

}
