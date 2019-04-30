package com.project2019.webservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성 됩니다.
//특별히 @Repository를 추가할 필요도 없습니다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

    
}