
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
		int result = 0;
		
		if(p instanceof HealthyPerson )
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
		return String.format("%s Is in for %s", super.toString(), this.reason);
	}
}
