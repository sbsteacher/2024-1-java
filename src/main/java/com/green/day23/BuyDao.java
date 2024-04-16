package com.green.day23;

import com.green.day22.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuyDao {
    private final MyConnection myConn;

    public BuyDao() {
        myConn = new MyConnection();
    }

    public int insBuy(BuyEntity entity) {
        String sql = "INSERT INTO buy (mem_id, prod_name, group_name, price, amount)" +
                     " VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    //파라미터 memId
    public List<BuySelVo> selBuyGroupByMemId() {
        List<BuySelVo> list = new ArrayList();
        String sql = "SELECT mem_id, COUNT(mem_id) AS buy_count FROM buy GROUP BY mem_id";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while(rs.next()) {
                String memId = rs.getString("mem_id");
                int buyCount = rs.getInt("buy_count");
                BuySelVo vo = new BuySelVo(memId, buyCount);
                list.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int updBuy(BuyEntity entity) { //num컬럼 제외 모든 컬럼 수정
        String sql = "UPDATE buy SET " +
                "   mem_id = ?" +
                " , prod_name = ?" +
                " , group_name = ?" +
                " , price = ?" +
                " , amount = ?" +
                " WHERE num = ?";

        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity.getMemId());
            ps.setString(2, entity.getProdName());
            ps.setString(3, entity.getGroupName());
            ps.setInt(4, entity.getPrice());
            ps.setInt(5, entity.getAmount());
            ps.setInt(6, entity.getNum());

            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delBuy(int num) {
        String sql = "DELETE FROM buy WHERE num = ?";
        try (Connection conn = myConn.getConn();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num);

            System.out.println(ps);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}

class BuySelListDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        List<BuySelVo> list = buyDao.selBuyGroupByMemId();
        for(BuySelVo vo : list) {
            System.out.println(vo);
        }
    }
}


class BuyDelDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();

        int affectedRow = buyDao.delBuy(17);
        System.out.printf("affectedRow: %d\n", affectedRow);
    }
}


class BuyUpdDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao(); // MyConnection객체 주소값 갖게 된다.
        BuyEntity entity = new BuyEntity();
        entity.setNum(17);
        entity.setMemId("MMU");
        entity.setProdName("구두2");
        entity.setGroupName("패션2");
        entity.setPrice(302);
        entity.setAmount(5);
        buyDao.updBuy(entity);
    }
}

class BuyDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao(); // MyConnection객체 주소값 갖게 된다.
        BuyEntity entity = new BuyEntity();
        entity.setMemId("RED");
        entity.setProdName("구두");
        entity.setGroupName("패션");
        entity.setPrice(300);
        entity.setAmount(3);

        int affectedRow = buyDao.insBuy(entity);
        System.out.printf("affectedRow: %d\n", affectedRow);

    }
}