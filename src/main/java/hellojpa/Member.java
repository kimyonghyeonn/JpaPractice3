package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //JPA 관리 대상으로 인식한다
public class Member {
    @Id //무엇이 PK인지 알려주는 어노테이션
    private long id;
    @Column(unique = true, length = 10)
    private String name;
    private  int age;
    private  String addr;


    public Member() {
    }

    public Member(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
