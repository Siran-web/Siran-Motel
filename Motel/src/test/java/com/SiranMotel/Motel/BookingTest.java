package com.SiranMotel.Motel;


import com.SiranMotel.Motel.entities.BookingEntity;
import com.SiranMotel.Motel.repositories.BookingRepository;
import com.SiranMotel.Motel.services.BookingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class BookingTest {

    @Autowired
    private BookingService bookingService;

}
