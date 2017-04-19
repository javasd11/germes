package org.itsimulator.germes.app.model.entity.geography;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.itsimulator.germes.app.model.entity.transport.TransportType;
import org.junit.Before;
import org.junit.Test;

/**
 * Contains unit-tests to check functionality of {@link City} class �
 * 
 * @author admin
 *
 */
public class CityTest {

	private City city;

	@Before
	public void setup() {
		city = new City("tets city");
	}

	@Test
	public void testAddValidStationSuccess() {
		Station station = city.addStation(TransportType.AUTO);
		
		assertTrue(containsStation(city, station));
		assertEquals(city, station.getCity());
	}

	@Test(expected = NullPointerException.class)
	public void testaddNullStationFailure() {
		city.addStation(null);
		assertTrue(false);
	}

//	@Test
//	public void testaddDuplicateStationFailure() {
//		Station station = city.addStation(TransportType.AUTO);
//		
//		city.addStation(station);
//		city.addStation(station);
//		assertEquals(city.getStations().size(), 1);
//	}

	@Test
	public void testRemoveStationSuccess() {
		Station station = city.addStation(TransportType.AUTO);
//		Station station = new Station();
//		city.addStation(station);
		city.removeStation(station);
		assertTrue(city.getStations().isEmpty());
	}
		
	@Test(expected=NullPointerException.class)
	public void testRemoveNullStationFailure() {
		city.removeStation(null);
		assertTrue(false);
	}
	
	private boolean containsStation(City city, Station station) {
		return city.getStations().contains(station);
	}

}
