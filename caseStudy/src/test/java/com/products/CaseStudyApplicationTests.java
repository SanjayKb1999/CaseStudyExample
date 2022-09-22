package com.products;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.products.repository.ProductsRepository;



@SpringBootTest
class CaseStudyApplicationTests {
	
	
@Autowired
public ProductsRepository prepository;
@Test
  void isproductExistById() {
         boolean a = prepository.existsById((long) 11);
         assertThat(a).isTrue();
        
    }
}