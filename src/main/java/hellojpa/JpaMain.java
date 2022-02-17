package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
//            엔티티 매핑 소개
//            객체와 테이블 매핑: @Entity, @Table / 필드와 컬럼 매핑: @Column / 기본 키 매핑: @Id / 연관관계 매핑: @ManyToOne, @JoinColumn
//            해당 예제에서는 Member클래스에서 내용을 주로 다룹니다


//            데이터베이스 스키마 자동 생성 (persistence.xml 파일에 옵션 부분을 수정함-hibernate.hbm2ddl.auto 주석 해제)
//            DDL을 애플리케이션 실행 시점에 자동 생성 / 테이블 중심 => 객체 중심 / 데이터베이스 방언을 활용해서 DB에 맞는 적절한 DDL 생성 / (중요) 이렇게 생성된 DDL은 개발 장비에서만 사용 / 생성된 DDL은 운영서버에서는 사용하지 않거나 적절히 다듬은 후 사용
//            애플리케이션을 실행하면 drop table 문과 create table문을 자동으로 실행해준다





            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();

















    }
}
