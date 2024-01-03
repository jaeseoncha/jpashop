package jpabook.jpashop;

import com.sun.org.apache.xpath.internal.operations.Or;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        // 연결 db당 하나만 생성
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("hello");
        // 커넥션 받아오기
        EntityManager em =emf.createEntityManager();

        EntityTransaction tx  =em.getTransaction();

        tx.begin();
///////////////////////



        Order order = new Order();
        order.addOrderItem( new OrderItem());

//
//        OrderItem orderItem = new OrderItem();
//        orderItem.setOrder( order );
//





////////////////
        tx.commit();
        em.close();

        emf.close();
    }

}
