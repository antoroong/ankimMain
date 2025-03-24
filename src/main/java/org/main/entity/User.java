package org.main.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "USERS")  // 오라클에서 테이블 이름을 명시적으로 지정하는 것이 좋음
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 오라클의 SEQUENCE 사용 시 전략 변경 가능
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false)
    private String password;
}