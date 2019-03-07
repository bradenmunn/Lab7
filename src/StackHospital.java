import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class StackHospital<PatientType>  extends Hospital<PatientType>{
	
	private Stack<PatientType> patients;
	
	/**
	 * Add a patient to the Hospital.
	 *
	 * @param patient The patient to be added.
	 */
	public void addPatient(PatientType patient)
	{
		patients.add(patient);
	}

	/**
	 * Find and return the patient who will next be treated. Does not treat the patient (i.e. it is not
	 * removed from the collection of patients that the hospital still must treat).
	 *
	 * @return The patient who would be next treated.
	 */
	public PatientType nextPatient()
	{
		return patients.peek();
	}

	/**
	 * Treats the next patient and removes them from the Hospital. Once someone is healed they
	 * no longer need to stay in the Hospital.
	 *
	 * @return The patient receiving treatment.
	 */
	public PatientType treatNextPatient() throws EmptyStackException
	{
		return patients.pop();
	}

	/**
	 * Calculate and return the number of patients still in the hospital (untreated).
	 *
	 * @return The number of patients in the Hospital.
	 */
	public int numPatients()
	{
		return patients.size();
	}

	/**
	 * Gives a String for the hospital type.
	 *
	 * @return A string exactly matching the class name.
	 */
	public String hospitalType()
	{
		//TODO
	}

	/**
	 * Prints all patient information.
	 *
	 * @return The toString of all patients, concatenated (don't add spaces, newlines, etc...).
	 */
	public String allPatientInfo()
	{
		String result = "";
		for(PatientType patient: patients)
		{
			result += (patient.toString());
		}
		
		return result;
	}

}
