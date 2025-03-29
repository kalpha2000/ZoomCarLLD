package org.example.Repository;

import org.example.dto.Reservation;

public interface ReservationRepository {
    public Reservation getReservationById(String id);

    public void createReservation(Reservation reservation);

    public void cancelReservation(String id);
}
