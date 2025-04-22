package sa.cheko.restaurant.menu.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuItemDto {
    private Long id;
    private String name;
    private String imageUrl;
    private String description;
    private int calories;
    private double price;
    private Integer categoryId;
    private String categoryName;
    private Boolean bestSale;
}
