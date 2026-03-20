package Day10As6;

class Member {
    int memberId;
    String membershipType;

    // Default constructor
    Member() {
        memberId = 501;
        membershipType = "Regular";
    }

    void display() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Membership Type: " + membershipType);
    }
}

public class Library {
    public static void main(String[] args) {
        Member m1 = new Member(); // object creation
        m1.display();             // display values
    }
}
