// 4.Smart Library Membership System (Medium)
// Scenario:
// A library provides memberships:
// ● StudentMember
// ● FacultyMember
// ● GuestMember
// Superclass:
// LibraryMember
// Fields:
// String memberName;
// String memberId;
// Method:
// calculateFine(int overdueDays)
// Each membership type calculates fines differently.
// Requirements:
// 1. Store all members in a LibraryMember[] array.
// 2. Create a method to print member details.
// 3. Use dynamic method dispatch to calculate fines.
// 4. Find and display the member whose ID matches a given string.
class LibraryMember {
    String memberName;
    String memberId;
    
    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }
    
    double calculateFine(int overdueDays) {
        return 0;
    }
    
    void printDetails() {
        System.out.println("Member: " + memberName + ", ID: " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }
    
    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5.0;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }
    
    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 3.0;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }
    
    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 10.0;
    }
}

public class ScenarioBased4 {
    public static void main(String[] args) {
        LibraryMember[] members = new LibraryMember[5];
        members[0] = new StudentMember("Alice", "S001");
        members[1] = new FacultyMember("Dr. Smith", "F001");
        members[2] = new GuestMember("Bob", "G001");
        members[3] = new StudentMember("Charlie", "S002");
        members[4] = new FacultyMember("Dr. Johnson", "F002");
        
        // Print all members and their fines
        for (LibraryMember member : members) {
            if (member != null) {
                member.printDetails();
                System.out.println("Fine for 5 overdue days: $" + member.calculateFine(5));
                System.out.println();
            }
        }
        
        // Find member by ID
        String searchId = "S002";
        findMemberById(members, searchId);
    }
    
    static void findMemberById(LibraryMember[] members, String id) {
        for (LibraryMember member : members) {
            if (member != null && member.memberId.equals(id)) {
                System.out.println("Found member:");
                member.printDetails();
                return;
            }
        }
        System.out.println("Member with ID " + id + " not found.");
    }
}
