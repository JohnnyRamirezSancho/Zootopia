package com.zootopia.zootopia.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpecimenTest {

    Specimen miSpecimen = new Specimen();
    Specimen miSpecimenParams = new Specimen((long)1, "Max", (long)1, (long)2, (long)2, "06-02-2023");
	@Test
	void SpecimenHaveName() {
        miSpecimen.setName("Snoopy");
        assertEquals("Snoopy", miSpecimen.getName());
	}
    @Test
    void SpecimenHaveDate() {
        miSpecimen.setDate("2023-02-06");
        assertEquals("2023-02-06", miSpecimen.getDate());
    }
    @Test
    void SpecimenHaveCountry() {
        miSpecimen.setId_country((long) 1);
        assertEquals(1, miSpecimen.getId_country());
    }

    @Test
    void SpecimenHaveGender() {
        miSpecimen.setId_gender((long)1);
        assertEquals(1, miSpecimen.getId_gender());
    }
    
    @Test
    void SpecimenHaveSpecie() {
        miSpecimen.setId_specie((long)1);
        assertEquals(1, miSpecimen.getId_specie());
    }
    @Test
    void SpecimenHaveParams() {
        assertEquals("Max",miSpecimenParams.getName());
        assertEquals(1, miSpecimenParams.getId());
        assertEquals(2, miSpecimenParams.getId_country());
        assertEquals(1, miSpecimenParams.getId_gender());
        assertEquals(2,miSpecimenParams.getId_specie());
        assertEquals("06-02-2023", miSpecimenParams.getDate());
    
    }

    
}
