import org.junit.Assert;
import org.junit.Test;

public class PatientsTest {
	
	// Tests for HealthyPerson class
	@Test
	public void HealthyTest()
	{
		HealthyPerson h1 = new HealthyPerson("Braden", 19, "Fracture");
		HealthyPerson h2 = new HealthyPerson("Braden", 22, "Check-up");
		HealthyPerson h3 = new HealthyPerson("Will", 19, "Check-up");
		SickPerson s1 = new SickPerson("Gabe", 19, 5);
		
		Assert.assertEquals(0, h1.compareToImpl(h2));
		Assert.assertEquals(-1, h1.compareToImpl(h3));
		Assert.assertEquals(1, h3.compareToImpl(h1));
		Assert.assertEquals(0, h1.compareToImpl(s1));
		Assert.assertEquals("Braden, a 19-year old. Is in for Fracture", h1.toString());
	}
	
	// Tests for SickPerson class
	@Test
	public void SickTest()
	{
		SickPerson s1 = new SickPerson("Gabe", 19, 5);
		SickPerson s2 = new SickPerson("Gabe", 50, 3);
		SickPerson s3 = new SickPerson("Alex", 19, 2);
		HealthyPerson h1 = new HealthyPerson("Braden", 19, "Fracture");
		
		Assert.assertEquals(0, s1.compareToImpl(s2));
		Assert.assertEquals(-1, s3.compareToImpl(s1));
		Assert.assertEquals(1, s1.compareToImpl(s3));
		Assert.assertEquals(0, s1.compareToImpl(h1));
		Assert.assertEquals("Gabe, a 19-year old. Severity level 5", s1.toString());
	}
	
	// Tests for Animal class
	@Test
	public void AnimalTest()
	{
		Animal a1 = new Animal("Beagle", 8);
		Animal a2 = new Animal("Retriever", 8);
		Animal a3 = new Animal("Pug", 5);
		
		Assert.assertEquals("Beagle", a1.getBreed());
		Assert.assertEquals(8, a1.getAge());
		Assert.assertEquals("A 8-year old Beagle.", a1.toString());
		Assert.assertEquals(-3, a1.compareTo(a3));
		Assert.assertEquals(3, a3.compareTo(a1));
		Assert.assertEquals(0, a1.compareTo(a2));
	}
	
	
	
	

}
