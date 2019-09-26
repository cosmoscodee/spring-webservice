package com.project2019.webservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

// 보통 iBatis/MyBatis 등에서 Dao라고 불리는 DB layer 접근자이다.
// JPA에선 Repository라고 부르며, 인터페이스로 생성한다.
// 단순히 인터페이스를 생성후, JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성 된다.
// 특별히 @Repository를 추가할 필요도 없다.

public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p " +
            "FROM Posts p " +
            "ORDER BY p.id DESC")
    Stream<Posts> findAllDesc();
}