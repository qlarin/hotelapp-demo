package pl.stsledziona.demos.hotelapp.service.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.stsledziona.demos.hotelapp.domain.Reservation;

@Stateless
public class ReservationDao {

	@PersistenceContext
	EntityManager em;

	public void addReservation(Reservation r) {
		r.setId(null);
		em.persist(r);
	}

	public void editReservation(Reservation r) {
		em.merge(r);
	}

	public void deleteReservation(Reservation r) {
		r = em.find(Reservation.class, r.getId());
		em.remove(r);
	}

	public Reservation getReservation(Reservation r) {
		return em.find(Reservation.class, r.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Reservation> getAllReservations() {
		return em.createNamedQuery("SELECT r FROM Reservation r").getResultList();
	}

	public Reservation getId(Long id) {
		return em.find(Reservation.class, id);
	}

}
