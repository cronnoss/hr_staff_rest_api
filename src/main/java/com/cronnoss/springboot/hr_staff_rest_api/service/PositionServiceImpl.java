package com.cronnoss.springboot.hr_staff_rest_api.service;

import com.cronnoss.springboot.hr_staff_rest_api.dao.PositionDao;
import com.cronnoss.springboot.hr_staff_rest_api.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDao positionDao;

    @Override
    @Transactional
    public List<Position> getAllPositions() {
        return positionDao.getAllPositions();
    }

//    @Override
//    @Transactional
//    public void savePosition(Position position) {
//        positionDao.savePosition(position);
//    }
//
//    @Override
//    @Transactional
//    public Position getPosition(int id) {
//        return positionDao.getPosition(id);
//    }
//
//    @Override
//    @Transactional
//    public void deletePosition(int id) {
//        positionDao.deletePosition(id);
//    }
}