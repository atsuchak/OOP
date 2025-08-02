class Member extends Library {

    int memberId;
    String memberName;

    Member() {
//        System.out.println("Default Member -No value assigned");
    }


    Member(int id, String name, int memberId, String memberName) {
        super(id, name);
        this.memberId = memberId;
        this.memberName = memberName;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Member ID: "+memberId);
        System.out.println("Member name: "+memberName);
    }
}
