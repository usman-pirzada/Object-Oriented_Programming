import java.util.ArrayList;
import java.util.List;

class Issue<T> {
    T issueType;
    T issueTitle;
    T issueDetails;

    Issue(T issueType, T issueTitle, T issueDetails) {
        this.issueType = issueType;
        this.issueTitle = issueTitle;
        this.issueDetails = issueDetails;
    }
}

class Task_01 {

    static <T> Issue<T> createIssues(T issueType, T issueTitle, T issueDetails) {
        Issue<T> issue = new Issue<T>(issueType, issueTitle, issueDetails);
        return issue;
    }

    static void printIssues(List<Issue<?>> issuesList) {
        for (Issue<?> issue : issuesList) {
            System.out.println("\n" + issue.issueType + "\n" + issue.issueTitle + ": " + issue.issueDetails);
        }
    }

    public static void main(String[] args) {

        Task_01 task = new Task_01();

        List<Issue<?>> myList = new ArrayList<>();

        myList.add(createIssues("HR Issue", "Ticket No. for Salary Query", 65491));
        myList.add(createIssues("Technical Issue", "Server Down", "Due to frequent breakdown electricity server efficiency has been downgraded!"));
        myList.add(createIssues("Admin Issue", "Office Supplies Shortage", "Referred to Case# 65184129"));

        printIssues(myList);
    }
}