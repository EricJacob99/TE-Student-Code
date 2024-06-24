package com.techelevator.dao;

import com.techelevator.exception.DaoException;
import com.techelevator.exception.ItemNotFoundException;
import com.techelevator.model.MenuItem;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCMenuItemItemDAO implements MenuItemDAO {

    //4. Add a JdbcTemplate variable
    private JdbcTemplate jdbcTemplate;




    //3.  Create a constructor that receives the datasource
    public JDBCMenuItemItemDAO (DataSource dataSource) {
        //5  instantiate the jdbcTemplate and pass it the datasource
        jdbcTemplate = new JdbcTemplate(dataSource);
    }



    @Override
    public MenuItem retrieveMenuItemById(int id) {

        MenuItem menuItem = null;

        String sql = "SELECT menu_items.id, menu_items.name as menu_item_name, description, price, categories.name AS category_name FROM menu_items " +
                "JOIN categories ON menu_items.category_id = categories.id WHERE menu_items.id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);


        if(results.next()) {
            //call map row
            menuItem = mapToRowSetMenuItem(results);

        }

        return menuItem;
    }

    @Override
    public MenuItem retrieveMenuItemByName(String name) {

       // SELECT menu_items.id, menu_items.name, description, price, categories.name
      //  FROM menu_items
        //  JOIN categories ON categories.id = menu_items.category_id
        //  WHERE menu_items.name = ?;

        MenuItem menuItem = null;

        String sql = "SELECT menu_items.id, menu_items.name AS menu_item_name, description, price, categories.name AS category_name FROM menu_items " +
                "JOIN categories ON menu_items.category_id = categories.id  WHERE menu_items.name = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);


        if(results.next()) {
            //call map row
            menuItem = mapToRowSetMenuItem(results);

        }

        return menuItem;
    }

    @Override
    public List<MenuItem> retrieveMenuItems() {

        List<MenuItem> menuItems = new ArrayList<>();

        String sql = "SELECT menu_items.id, menu_items.name AS menu_item_name, description, price, categories.name AS category_name FROM menu_items " +
                "JOIN categories ON menu_items.category_id = categories.id;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while(results.next()) {

            MenuItem item = mapToRowSetMenuItem(results);
            menuItems.add(item);
        }


        return menuItems;
    }

    @Override
    public MenuItem createMenuItem(MenuItem newItem) {

      String sql = "INSERT INTO menu_items (name, description, price, category_id) VALUES (?, ?, ?, (SELECT id FROM categories WHERE name = ?)) RETURNING id;";

      int menuItemId = jdbcTemplate.queryForObject(sql, int.class, newItem.getName(), newItem.getDescription(), newItem.getPrice(), newItem.getCategoryName());

      //add newItemId to thr newItem and return
      newItem.setId(menuItemId);
      return newItem;
    }

    @Override
    public MenuItem updateMenuItem(MenuItem itemToUpdate) {

        String sql = "UPDATE menu_items " +
        "SET name = ?, description = ?, price = ?, category_id = (SELECT id FROM categories WHERE name = ?) " +
        "WHERE id = ?;";

        jdbcTemplate.update(sql, itemToUpdate.getName(), itemToUpdate.getDescription(), itemToUpdate.getPrice(), itemToUpdate.getCategoryName(), itemToUpdate.getId());


        return itemToUpdate;
    }

    @Override
    public void deleteMenuItem(int menuItemId) throws DaoException, ItemNotFoundException {

        String sql = "DELETE FROM menu_items WHERE id = ?";

        try {
            int rowsupdated = jdbcTemplate.update(sql, menuItemId);
            if (rowsupdated == 0) {
                throw new ItemNotFoundException();
            }
        }
        catch (CannotGetJdbcConnectionException e) {
            e.printStackTrace();
            throw new DaoException("oops I did it again", e);
        }




    }


    public MenuItem mapToRowSetMenuItem(SqlRowSet sqlRowSet) {
        MenuItem menuItem = new MenuItem();
        menuItem.setDescription(sqlRowSet.getString("description"));
        menuItem.setId(sqlRowSet.getInt("id"));
        menuItem.setName(sqlRowSet.getString("menu_item_name"));
        menuItem.setPrice(sqlRowSet.getDouble("price"));
        menuItem.setCategoryName(sqlRowSet.getString("category_name"));

        return menuItem;
    }
}
