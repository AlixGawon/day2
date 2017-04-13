package park;

/**
 * Created by Administrator on 2017-04-12.
 */
public class Park {

    //멤버변수 만들기(데이터 넣는 공간 만드는 것)

    private String parkKey;
    private String parkName;
    private String parkAlias;
    private String city;
    private String state;
    private String country;

    //디폴트 생성자 메서드 만들기

    public Park(){

    }
    //인자 다 있는 생성자 메서드 만들기

    public Park(String parkKey, String parkName, String parkAlias,
                String city, String state, String country) {
        this.setParkKey(parkKey);
        this.setParkName(parkName);
        this.setParkAlias(parkAlias);
        this.setCity(city);
        this.setState(state);
        this.setCountry(country);
    }

    //getter, setter 만들기

    public String getParkKey() {
        return parkKey;
    }

    public void setParkKey(String parkKey) {
        this.parkKey = parkKey;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkAlias() {
        return parkAlias;
    }

    public void setParkAlias(String parkAlias) {
        this.parkAlias = parkAlias;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
