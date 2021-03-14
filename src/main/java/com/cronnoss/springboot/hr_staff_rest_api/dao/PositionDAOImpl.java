package com.cronnoss.springboot.hr_staff_rest_api.dao;


import com.cronnoss.springboot.hr_staff_rest_api.entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PositionDAOImpl implements PositionDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Position> getAllPositions() {

        Session session = sessionFactory.getCurrentSession();
//        List<Position> allPositions = session.createQuery("from Position"
//                , Position.class).getResultList();

        Query<Position> query = session.createQuery("from Position"
                , Position.class);
        List<Position> allPositions = query.getResultList();

        return allPositions;
    }

    @Override
    public void savePosition(Position position) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(position);
    }

    @Override
    public Position getPosition(int id) {
        Session session = sessionFactory.getCurrentSession();
        Position position = session.get(Position.class, id);
        return position;
    }

    @Override
    public void deletePosition(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Position> query = session.createQuery("delete from Position " +
                "where id =:posid");
        query.setParameter("posid", id);
        query.executeUpdate();
    }
}