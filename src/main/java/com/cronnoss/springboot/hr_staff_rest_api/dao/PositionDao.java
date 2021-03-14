package com.cronnoss.springboot.hr_staff_rest_api.dao;



import com.cronnoss.springboot.hr_staff_rest_api.entity.Position;

import java.util.List;

public interface PositionDao {
    public List<Position> getAllPositions();

    public void savePosition(Position position);

    public Position getPosition(int id);

    public void deletePosition(int id);
}