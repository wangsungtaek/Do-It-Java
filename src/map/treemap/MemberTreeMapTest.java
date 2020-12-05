package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberTreehMap = new MemberTreeMap();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberPark = new Member(1003, "박서훤");
		Member memberSon = new Member(1002, "손민국");

		
		memberTreehMap.addMember(memberLee);
		memberTreehMap.addMember(memberSon);
		memberTreehMap.addMember(memberPark);
		memberTreehMap.addMember(memberHong);
		
		memberTreehMap.showAllMember();
		
		memberTreehMap.removeMember(1004);
		memberTreehMap.showAllMember();
	}
}
