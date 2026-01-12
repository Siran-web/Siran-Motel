package com.SiranMotel.Motel.repositories;

import com.SiranMotel.Motel.entities.BookingEntity;
import com.SiranMotel.Motel.type.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
    @Query("""
        SELECT COUNT(b) > 0 FROM BookingEntity b
        WHERE b.room.roomType = :roomType
        AND b.checkIn < :checkOut
        AND b.checkOut > :checkIn
    """)
    boolean existsOverlappingBooking(
            @Param("roomType") RoomType roomType,
            @Param("checkIn") LocalDate checkIn,
            @Param("checkOut") LocalDate checkOut
    );
}
