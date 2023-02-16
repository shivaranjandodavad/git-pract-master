package com.feed.feedservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;
    String url;

    String title;
    String content;
    String likes;
    String shares;

}
