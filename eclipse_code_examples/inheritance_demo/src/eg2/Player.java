package eg2;

public class Player extends Person {

	
	private String teamName;
	private double averageScore;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int age, String teamName, double averageScore) {
		super(id, name, age);
		this.teamName = teamName;
		this.averageScore = averageScore;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	@Override
	public String toString() {
		return "Player [teamName=" + teamName + ", averageScore=" + averageScore + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
