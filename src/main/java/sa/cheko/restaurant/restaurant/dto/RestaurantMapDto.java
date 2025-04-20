package sa.cheko.restaurant.restaurant.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantMapDto {
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    private String logoUrl;
}
