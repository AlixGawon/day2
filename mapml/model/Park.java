package mapml.model;

/**
 * Created by Administrator on 2017-04-13.
 */
public class Park {


        //private String parkKey; 이것은 필요가 없음. 따로 String 으로 받아옴! 그래서 모든 구성원에서도 제외.
        private String parkName;
        private String parkAlias;
        private String city;
        private String state;
        private String country;

        //생성자(getter,setter 생성한 다음 만들기!)


        public Park() {
        }

        public Park(String parkName, String parkAlias, String city, String state, String country) {
            this.parkName = parkName;
            this.parkAlias = parkAlias;
            this.city = city;
            this.state = state;
            this.country = country;
        }

        //setter, getter
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

        //toString 생성해서 주소 안 나오게 하기!

        @Override
        public String toString() {
            return "Park{" +
                    "parkName='" + parkName + '\'' +
                    ", parkAlias='" + parkAlias + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

