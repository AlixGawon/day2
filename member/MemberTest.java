package member;

/**
 * Created by Administrator on 2017-04-12.
 */
public class MemberTest {

    private String name;
    private int age;
    private String hpnum;
    private String email;

    public MemberTest(){

    }

    public MemberTest(String name, int age, String hpnum, String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    //getter, setter 만들기! refacter 이용해서 구하기.(alt + insert)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHpnum() {
        return hpnum;
    }

    public void setHpnum(String hpnum) {
        this.hpnum = hpnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
