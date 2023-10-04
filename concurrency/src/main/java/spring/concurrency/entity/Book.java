package spring.concurrency.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "price", nullable = false)
    private int price;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "stock_id", nullable = false)
    private Stock stock;

    @Version
    private Long version;

    public Book(final String name, final int price, final Stock stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void purchase(final long quantity) {
        stock.decrease(quantity);
    }

    public void load(final long quantity){
        stock.increase(quantity);
    }
}