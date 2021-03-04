public class HoGiaDinh {
    private Person person;
    private int soNha;
    private int soNguoiTrongGiaDinh;

    public HoGiaDinh(Person person, int soNha, int soNguoiTrongGiaDinh) {
        this.person = person;
        this.soNha = soNha;
        this.soNguoiTrongGiaDinh = soNguoiTrongGiaDinh;
    }

    public HoGiaDinh() {
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getSoNguoiTrongGiaDinh() {
        return soNguoiTrongGiaDinh;
    }

    public void setSoNguoiTrongGiaDinh(int soNguoiTrongGiaDinh) {
        this.soNguoiTrongGiaDinh = soNguoiTrongGiaDinh;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "person=" + person +
                ", soNha=" + soNha +
                ", soNguoiTrongGiaDinh=" + soNguoiTrongGiaDinh +
                '}';
    }

}
