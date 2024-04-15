package com.green.day22;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//Member 테이블용 Data Access Object
public class MemberDao {
    private MyConnection myConn; //MyConnection 객체 주소값이 주입이 되어야한다.

    public MemberDao() {
        myConn = new MyConnection();
    }
    public int insMember(MemberEntity entity) {
        String sql = String.format("INSERT INTO member" +
                " (mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date) " +
                " VALUES " +
                " ('%s', '%s', %d, '%s', '%s', '%s', %d, '%s') "
                , entity.getMemId(), entity.getMemName(), entity.getMemNumber(), entity.getAddr()
                , entity.getPhone1(), entity.getPhone2(), entity.getHeight(), entity.getDebutDate()
        );
        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }

        return result;
    }

    int updMember(MemberEntity entity) {
        String mid = "";
        if(entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name = '%s' ", entity.getMemName());
        }
        if(entity.getMemNumber() > 0) {
            mid += String.format(", mem_number = %d ", entity.getMemNumber());
        }
        if(entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", addr = '%s' ", entity.getAddr());
        }
        if(entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += String.format(", phone1 = '%s' ", entity.getPhone1());
        }
        if(entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2 = '%s' ", entity.getPhone2());
        }
        if(entity.getHeight() > 0) {
            mid += String.format(", height = %d ", entity.getHeight());
        }
        mid = mid.substring(1);
        System.out.println(mid);

        String sql = String.format("UPDATE member SET %s WHERE mem_id = '%s'", mid, entity.getMemId());

        System.out.println(sql);
        Connection conn = null;
        Statement stat = null;
        int result = 0;
        try {
            conn = myConn.getConn();
            stat = conn.createStatement();
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat, conn);
        }

        return result;
    }

}
class SubStringTest {
    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(str.substring(3));
        System.out.println(str.substring(4, 7));
        System.out.println(str);


        String str2 = ", 안녕, 하하, 좋아요";
        System.out.println(str2.startsWith(","));
        String str3 = str2.substring(1);
        System.out.println("str3: " + str3);
    }
}

class MemberDaoUpdateTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemNumber(6);
        member.setAddr("제주");
        member.setPhone1("011");

        int affectdRow = memberDao.updMember(member);
        System.out.printf("affectedRow: %d\n", affectdRow);
    }
}


class MemberDAOTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(); //객체화 했다.

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemName("뉴진스");
        member.setMemNumber(4);
        member.setAddr("대구");
        member.setPhone1("053");
        member.setPhone2("77777777");
        member.setHeight(166);
        member.setDebutDate("2022-10-01");

        int affectedRow = memberDao.insMember(member);
        System.out.printf("affectedRow: %d\n", affectedRow);

        //insMember 메소드 호출
        //1. 메소드가 어디에 있는지 확인 > MemberDAO에 있는 것을 확인함
        //2. static 메소드인지 아닌지 확인. 왜? 호출방법이 달라진다. > static 메소드가 아니기 때문에 MemberDao를 객체화 해야 한다.
        //3. 선언부를 확인하니 리턴타입은 int, 파라미터는 MemberEntity 객체 주소값 필요한 것을 확인
        //4. MeberDao객체 주소값 도트연산자를 이용하여 메소드 선언부에 맞추어 호출을 한다.
    }
}