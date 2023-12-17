package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO {
    public boolean saveitem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    public void delete(String code) throws SQLException, ClassNotFoundException;
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;
    public String generateID() throws SQLException, ClassNotFoundException;
    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException;
    public List<ItemDTO> loadAllItemCodes() throws SQLException, ClassNotFoundException;

}