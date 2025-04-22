package sa.cheko.restaurant.menu.domain;

import jakarta.persistence.*;
import lombok.*;
import sa.cheko.restaurant.category.domain.Category;
import sa.cheko.restaurant.restaurant.domain.Restaurant;

@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String imageUrl;
    private String description;
    private int calories;
    private double price;

    @Column(name = "best_sale")
    private Boolean bestSale = false;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

        @ManyToOne
    @JoinColumn(name = "restaurant_id") // ✅ New restaurant relation
    private Restaurant restaurant;
}
