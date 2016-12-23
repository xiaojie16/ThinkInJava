package chapters14;

/**
 * @author by kissx on 2016/9/26.
 */
public class Position {
    private String title;
    private People people;

    public Position(String title, People people) {
        this.title = title;
        this.people = people;
    }

    public Position(String jobTitle) {
        this.title = jobTitle;
        this.people = People.NULL;
    }

    public String getTitle() {
        return title;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People newPeople) {
        people = newPeople;
        if (people == null)
            people = People.NULL;
    }

    @Override
    public String toString() {
        return "Position: " + title + " " + people;
    }
}
