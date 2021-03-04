public class Person {
    private String hoTen;
    public int age;
    public String ngheNghiep;

    public Person(int soNha, String hoTen){
        this.hoTen=  hoTen;

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public Person(String hoTen, int age, String ngheNghiep) {
        this.hoTen = hoTen;
        this.age = age;
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", age=" + age +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                '}';
    }
}
