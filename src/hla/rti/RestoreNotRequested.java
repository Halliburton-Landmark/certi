/*
 * This file comes from SISO STD-004-2004 for HLA 1.3
 * from http://www.sisostds.org/ProductsPublications/Standards/SISOStandards.aspx.
 *
 * It is provided as-is by CERTI project.
 */
 

package hla.rti;

/**
 * Public exception class RestoreNotRequested
*/

public final class RestoreNotRequested extends RTIexception {

  /**
   * @param reason    String to be carried with exception
   */
  public RestoreNotRequested(String reason) {
	super(reason, 0);
  }

  /**
   * @param serial    serial number also printed with the exception
   */
  public RestoreNotRequested(String reason, int serial) {
	super(reason, serial);
  }
}
