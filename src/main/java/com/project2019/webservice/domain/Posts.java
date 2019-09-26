package com.project2019.webservice.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


// Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이며 보통 Entity Class 라고도 합니다.
// JPA를 사용하시면 DB 데이터에 작업할 경우 실제 쿼리를 날리기 보다는, 이 Entity 클래스의 수정을 통해 작업합니다.

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 자동 추가
@Getter // 클래스내 모든 필드의 Getter 메소드르 자동생성
@Entity
public class Posts extends BaseTimeEntity {

    @Id // 해당 테이블의 PK 필드를 나타낸다.
    @GeneratedValue // PK생성 규칙을 나타낸다.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더패턴 클래스를 생성.
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}


