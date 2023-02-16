import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;

public class MovieEcosystem extends Person
{
	private String birthPlace;
	private ArrayList<String> awards = new ArrayList<String>();
	private String info;
	private Image image;
	
	public MovieEcosystem() 
	{
		super();
		birthPlace = null; 
		info = null;
		//image = new Image();
	}

	public MovieEcosystem(String name, LocalDate birthDate, String b, String i)
	{
		super(name, birthDate);
		birthPlace = b;
		info = i;
		//image = new Image();
	}

	public String getBirthPlace()
	{
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace)
	{
		this.birthPlace = birthPlace;
	}

	public ArrayList<String> getAwards()
	{
		return awards;
	}

	public String getInfo()
	{
		return info;
	}

	public void setInfo(String info)
	{
		this.info = info;
	}

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public void addAward(String a)
	{
		awards.add(a);
	}

	@Override
	public String toString()
	{
		return super.toString() + "MovieEcosystem [birthPlace=" + birthPlace + ", awards=" + awards + ", information=" + info + ", image="
				+ image + "]";
	}
}