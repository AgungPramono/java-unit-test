package com.agung.belajar.unittest.mocking;

import com.agung.belajar.unittest.data.Person;
import com.agung.belajar.unittest.repository.PersonRepository;
import com.agung.belajar.unittest.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setup(){
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound(){
        assertThrows(IllegalArgumentException.class,() -> personService.get("not found"));
    }

    @Test
    void testPersonSuccess(){

        //tambah behaviour
        Mockito.when(personRepository.findById("eko")).thenReturn(new Person("eko","Eko"));

        Person person = personService.get("eko");
        assertNotNull(person);
        assertEquals("eko", person.getId());
        assertEquals("Eko", person.getNama());
    }
}
