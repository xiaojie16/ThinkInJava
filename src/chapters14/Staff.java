package chapters14;

import java.util.ArrayList;

/**
 * @author by kissx on 2016/9/26.
 */
public class Staff extends ArrayList<Position> {

    public void add(String title, People people) {
        add(new Position(title, people));
    }

    public void add(String... titles) {
        for (String title : titles)
            add(new Position(title));
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {
        for (Position position : this) {  //注意此处this的作用
            if (position.getTitle().equals(title) && position.getPeople() == People.NULL)
                return true;
        }
        return false;
    }

    public void fillPosition(String title, People hire) {
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPeople() == People.NULL) {
                position.setPeople(hire);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available"); //注意这里的处理
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CEO", "Project Lead", "Software Engineer");
        staff.fillPosition("President", new People("Last", "Me", "The Top,Lonely At"));
        if (staff.positionAvailable("CEO"))
            staff.fillPosition("CEO", new People("Coder", "Bob", "Bright Light City"));
        System.out.println(staff);
    }
}
