package interfaces;

//Using interfaces to create groups of constants.

/*
 * Note: andy fields you put into an interface are automatically
 *       static and final, so before Java SE5 this is the only way
 *       to produce the same effect as enum
 */

public interface Months {
	int
	  JANUARY = 1, FEBRUARY = 2, MARCH = 3,
	  APRIL = 4, MAY = 5, JUNE = 6, JULY = 7,
	  AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10,
	  NOVEMBER = 11, DECEMBER = 12;
}
