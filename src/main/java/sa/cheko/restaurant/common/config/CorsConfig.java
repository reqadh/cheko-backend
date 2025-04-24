package sa.cheko.restaurant.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 👈 جميع المسارات
                .allowedOrigins("http://localhost:3000") // 👈 السماح للفرونت
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 👈 السماح بجميع الطرق
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}


