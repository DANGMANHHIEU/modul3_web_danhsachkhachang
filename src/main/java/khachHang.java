import java.time.LocalDate;
import java.util.Date;

public class khachHang {
    private String name;
    private LocalDate birthday;
    private String address;
    private String photo;

    public khachHang() {
    }

    public khachHang(String name, LocalDate birthday, String address, String photo) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
