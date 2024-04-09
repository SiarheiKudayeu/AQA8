package lesson9.inheritance.ex2;

public class InheritanceTeamMemberMain {
    public static void main(String[] args) {
        QA qa = new QA("Alex", 33);
        System.out.println(qa);
        Developer dev = new Developer();
        System.out.println(dev);
        TeamMember teamMember = new TeamMember("Fedor", 23);
        System.out.println(teamMember);
        System.out.println("========");
        teamMember.doWork();
        dev.doWork();
        qa.doWork();
    }
}
