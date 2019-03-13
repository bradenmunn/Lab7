
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
		if(!(p instanceof SickPerson))
		{
			return 0;
		}
		else
		{
			if(this.severity < ((SickPerson)p).severity)
			{
				return 1;
			}
			else if(this.severity > ((SickPerson)p).severity)
			{
				return -1;
			}
			else // Names match
			{
				return 0;
			}
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), this.severity);
	}

}
