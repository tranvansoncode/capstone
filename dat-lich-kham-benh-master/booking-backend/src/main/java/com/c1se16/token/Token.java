package com.c1se16.token;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TOKEN")
public class Token {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jwt")
    @Lob
    private String jwt;

    @Lob
    @Column(name = "public_key")
    private byte[] publicKey;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;

    public Token(String jwt, byte[] publicKey) {
        this.jwt = jwt;
        this.publicKey = publicKey;
    }
}
