import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>{
	
	private Queue<PatientType> patientsFIFO;
	
	
	public QueueHospital()
	{
		patientsFIFO = new LinkedList<PatientType>();
	}
	/**
	 * Add a patient to the Hospital.
	 *
	 * @param patient The patient to be added.
	 */
	public void addPatient(PatientType patient)
	{
		patientsFIFO.add(patient);
	}

	/**
	 * Find and return the patient who will next be treated. Does not treat the patient (i.e. it is not
	 * removed from the collection of patients that the hospital still must treat).
	 *
	 * @return The patient who would be next treated.
	 */
	public PatientType nextPatient()
	{
		return patientsFIFO.peek();
	}

	/**
	 * Treats the next patient and removes them from the Hospital. Once someone is healed they
	 * no longer need to stay in the Hospital.
	 *
	 * @return The patient receiving treatment.
	 */
	public PatientType treatNextPatient()
	{
		return patientsFIFO.poll();
	}

	/**
	 * Calculate and return the number of patients still in the hospital (untreated).
	 *
	 * @return The number of patients in the Hospital.
	 */
	public int numPatients()
	{
		return patientsFIFO.size();
	}

	/**
	 * Gives a String for the hospital type.
	 *
	 * @return A string exactly matching the class name.
	 */
	public String hospitalType()
	{
		return "QueueHospital";
	}

	/**
	 * Prints all patient information.
	 *
	 * @return The toString of all patients, concatenated (don't add spaces, newlines, etc...).
	 */
	public String allPatientInfo()
	{
		String result = "";
		for(PatientType patient: patientsFIFO)
		{
			result += (patient.toString());
		}
		
		return result;
	}

}
