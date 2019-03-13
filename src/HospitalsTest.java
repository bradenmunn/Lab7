import org.junit.Assert;
import org.junit.Test;

public class HospitalsTest {
	
	@Test
	public void personHospitalTest()
	{
		StackHospital<Person> personStack = new StackHospital<Person>();
		QueueHospital<Person> personQueue = new QueueHospital<Person>();
    	PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();
    	
    	Person p1 = new HealthyPerson("Adam", 27, "Wrist");
    	Person p2 = new SickPerson("Hana", 12, 5);
    	Person p3 = new HealthyPerson("Jake", 24, "Headache");
    	
    	// Add to personStack (Stack)
    	personStack.addPatient(p1);
    	personStack.addPatient(p2);
    	personStack.addPatient(p3);
    	
    	// Add to personQueue (Queue)
    	personQueue.addPatient(p1);
    	personQueue.addPatient(p2);
    	personQueue.addPatient(p3);
    	
    	// Add to personPQueue (PriorityQueue)
    	personPQueue.addPatient(p1);
    	personPQueue.addPatient(p2);
    	personPQueue.addPatient(p3);
    	
    	// Tests addPatient()
    	Assert.assertEquals("Size is wrong", 3, personStack.numPatients());
    	Assert.assertEquals("Size is wrong", 3, personQueue.numPatients());
    	Assert.assertEquals("Size is wrong", 3, personPQueue.numPatients());
    	
    	// Tests nextPatient()
    	Assert.assertEquals("Wrong next patient", "Jake", personStack.nextPatient().getName());
    	Assert.assertEquals("Wrong next patient", "Adam", personQueue.nextPatient().getName());
    	Assert.assertEquals("Wrong next patient", "Adam", personPQueue.nextPatient().getName());
    	
    	// Tests treatNextPatient()
    	Assert.assertEquals("Wrong person treated", "Jake", personStack.treatNextPatient().getName());
    	Assert.assertEquals("Wrong person treated", "Adam", personQueue.treatNextPatient().getName());
    	Assert.assertEquals("Wrong person treated", "Adam", personPQueue.treatNextPatient().getName());
    	
    	//System.out.println(personPQueue.allPatientInfo());
    	// Tests hospitalType()
    	Assert.assertEquals("Wrong hospital type", "StackHospital", personStack.hospitalType());
    	Assert.assertEquals("Wrong hospital type", "QueueHospital", personQueue.hospitalType());
    	Assert.assertEquals("Wrong hospital type", "PriorityQueueHospital", personPQueue.hospitalType());
    	
    	// Tests allPatientInfo()
    	Assert.assertEquals("Incorrect toString()", "Adam, a 27-year old. Is in for WristHana, a 12-year old. Severity level 5", 
    			personStack.allPatientInfo());
    	Assert.assertEquals("Inocorrect toString()", "Hana, a 12-year old. Severity level 5Jake, a 24-year old. Is in for Headache", 
    			personQueue.allPatientInfo());
    	Assert.assertEquals("Inocorrect toString()", "Jake, a 24-year old. Is in for HeadacheHana, a 12-year old. Severity level 5", 
    			personPQueue.allPatientInfo());
    	
	}
	
	
	
	@Test
	public void animalHospitalTest()
	{
		StackHospital<Animal> animalStack = new StackHospital<Animal>();
		QueueHospital<Animal> animalQueue = new QueueHospital<Animal>();
    	PriorityQueueHospital<Animal> animalPQueue = new PriorityQueueHospital<Animal>();
    	
    	Animal a1 = new Animal("Beagle", 8);
		Animal a2 = new Animal("Retriever", 8);
		Animal a3 = new Animal("Pug", 5);
		
		// Add to animalStack (Stack)
    	animalStack.addPatient(a1);
    	animalStack.addPatient(a2);
    	animalStack.addPatient(a3);
    	
    	// Add to animalQueue (Queue)
    	animalQueue.addPatient(a1);
    	animalQueue.addPatient(a2);
    	animalQueue.addPatient(a3);
    	
    	// Add to animalPQueue (PriorityQueue)
    	animalPQueue.addPatient(a1);
    	animalPQueue.addPatient(a2);
    	animalPQueue.addPatient(a3);
    	
    	
	}

}
