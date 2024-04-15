package com.app_gestion_patient.projet_de_suivi_patients;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@WebMvcTest
@DataJpaTest
@BootstrapWith
@RunWith(SpringRunner.class)
class ProjetDeSuiviPatientsApplicationTests {

	@Test
	void contextLoads() {
	}

}
