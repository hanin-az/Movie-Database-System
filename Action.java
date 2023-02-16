import java.util.ArrayList;

public class Action
{
	protected Person person;
	protected Movie movie;
	protected static ArrayList<Action> actionsArrList = new ArrayList<Action>();
	
	public Action()
	{
		super();
	}
	public Action(Movie movie, Person person)
	{
		this.movie = movie;
		this.person = person;
		actionsArrList.add(this);
	}
	public Person getPerson()
	{
		return person;
	}
	public void setPerson(Person person)
	{
		this.person = person;
	}
	public Movie getMovie()
	{
		return movie;
	}
	public void setMovie(Movie movie)
	{
		this.movie = movie;
	}
	public ArrayList<Action> getActionsArrList()
	{
		return actionsArrList;
	}
	// method that displays all movies that the passed person has a relation with
	// example: all movies that user1 reviewed
	public static void displayAllMovies(Person person)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println(person.getName() + "\'s Movies Not Found.");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i).getPerson() == person)
				{
					found = true;
					System.out.println(actionsArrList.get(i).getMovie().getName());
				}
			}
			if (found == false)
				System.out.println(person.getName() + " Not found.");
		}
	}
	
	// method that displays all persons that the passed movie has a relation with
	// example: all reviewers of movie1
	public static void displayAllPersons(Movie movie)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println(movie.getName() + "\'s Persons Not Found.");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i).getMovie() == movie)
				{
					found = true;
					System.out.println(actionsArrList.get(i).getPerson().getName());
				}
			}
			if (found == false)
				System.out.println(movie.getName() + " Not found.");
		}
	}
	public void removeAction()
	{
		actionsArrList.remove(this);
	}
	@Override
	public String toString()
	{
		return "Action [person=" + person + ", movie=" + movie + ", actionsArrList=" + actionsArrList + "]";
	}
}