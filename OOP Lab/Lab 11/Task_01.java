import java.util.ArrayList;
import java.util.List;

class Issue<T> {
    T issueTitle;
    T issueDetails;

    Issue(T issueTitle, T issueDetails) {
        this.issueTitle = issueTitle;
        this.issueDetails = issueDetails;
    }
}

class Task_01 {

    <T> Issue<T> createIssues(T title, T detail) {
        Issue<T> issue = new Issue<T>(title, detail);
        return issue;
    }

    public static void main(String[] args) {

        Task_01 task = new Task_01();
        

        List<Issue <?>> myList = new ArrayList<>();
        myList.add(task.createIssues(54546, "This ticket is for technical issues."));

        System.out.println(myList.get(0));
    }
}