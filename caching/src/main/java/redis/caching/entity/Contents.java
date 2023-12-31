package redis.caching.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contents implements Serializable {

    @Id
    @GeneratedValue
    private Long contents_id;

    private String title;

    private String text;

}
