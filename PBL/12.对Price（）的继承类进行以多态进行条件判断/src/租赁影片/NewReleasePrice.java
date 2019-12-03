package ×âÁÞÓ°Æ¬;

import ×âÁÞÓ°Æ¬.Movie;

public class NewReleasePrice extends Price{
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	double getCharge(int daysRented) {
		return daysRented *3;
	}
}
