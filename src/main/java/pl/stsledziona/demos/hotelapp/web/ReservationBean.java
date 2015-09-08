package pl.stsledziona.demos.hotelapp.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import pl.stsledziona.demos.hotelapp.domain.Reservation;
import pl.stsledziona.demos.hotelapp.service.dao.impl.ReservationDao;

@SessionScoped
@Named("reservationBean")
public class ReservationBean implements Serializable {

	private static final long serialVersionUID = -4147417657013034261L;

	private Reservation reservation = new Reservation();
	private ListDataModel<Reservation> reservations = new ListDataModel<Reservation>();

	@Inject
	private ReservationDao rd;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public ListDataModel<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ListDataModel<Reservation> reservations) {
		this.reservations = reservations;
	}

	public String addReservation() {
		rd.addReservation(reservation);
		return "/reservations?faces-redirect=true";
	}

	public String editReservation() {
		rd.editReservation(reservation);
		return "/reservations?faces-redirect=true";
	}

	public String deleteReservation(Reservation r) {
		rd.deleteReservation(r);
		return "/reservations?faces-redirect=true";
	}

	public String showDetails(Reservation r) {
		setReservation(r);
		return "/reservationDetails?faces-redirect=true";
	}

	public ListDataModel<Reservation> getAllReservations() {
		reservations.setWrappedData(rd.getAllReservations());
		return reservations;
	}

}
