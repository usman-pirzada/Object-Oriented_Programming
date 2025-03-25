// Method Overriding
class Event {
    void schedule() {
        System.out.println("General Competition Schedule");
    }
}

class SpeedProgramming extends Event {
    @Override
    void schedule() {
        System.out.println("Speed Programming competition schedule");
    }
}

class WebDevelopment extends Event {
    @Override
    void schedule() {
        System.out.println("Web Development competition schedule");
    }
}

class AI_Challenge extends Event {
    @Override
    void schedule() {
        System.out.println("AI challenge schedule");
    }
}

class CyberSecurityChallenge extends Event {
    @Override
    void schedule() {
        System.out.println("CyberSecurity Challenge schedule");
    }
}

class BusinessCaseCompetition extends Event {
    @Override
    void schedule() {
        System.out.println("BusinessCase competition schedule");
    }
}

public class Q_05 {
    public static void main(String[] args) {
        Event event = new Event();
        SpeedProgramming sp = new SpeedProgramming();
        WebDevelopment wd = new WebDevelopment();
        AI_Challenge ai = new AI_Challenge();
        CyberSecurityChallenge cys = new CyberSecurityChallenge();
        BusinessCaseCompetition bs = new BusinessCaseCompetition();

        event.schedule();
        sp.schedule();
        wd.schedule();
        ai.schedule();
        cys.schedule();
        bs.schedule();
    }
}