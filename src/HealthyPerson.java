
public class HealthyPerson extends Person{

	private String reason;
	
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
	}
	
	@Override
	protected int compareToImpl(Person p)
	{
		if(!(p instanceof HealthyPerson))
		{
			return 0;
		}
		else
		{
			if(this.getName().compareToIgnoreCase(p.getName()) > 0)
			{
				return 1;
			}
			else if(this.getName().compareToIgnoreCase(p.getName()) < 0)
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
		return String.format("%s Is in for %s", super.toString(), this.reason);
	}
}
