
public class SickPerson extends Person{
	
	private int severity;
	
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.severity = severity;
	}
	
	@Override
	protected int compareToImpl(Person p)
	{
		int result = 0;
		
		if(p instanceof SickPerson)
		{
			if(this.getName().compareToIgnoreCase(p.getName()) > 0)
			{
				result =  1;
			}
			else if(this.getName().compareToIgnoreCase(p.getName()) < 0)
			{
				result = -1;
			}
		}
		else
		{
			result = 0; // If not HealthyPerson or if names are equal
		}
		
		return result;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), this.severity);
	}

}
