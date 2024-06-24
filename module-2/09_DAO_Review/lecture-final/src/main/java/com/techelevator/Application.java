package com.techelevator;


import com.techelevator.dao.JDBCMenuItemItemDAO;
import com.techelevator.dao.MenuItemDAO;
import com.techelevator.exception.DaoException;
import com.techelevator.exception.ItemNotFoundException;
import com.techelevator.model.MenuItem;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

public class Application {

    private final Scanner userInput = new Scanner(System.in);
    private MenuItemDAO menuItemDAO;    // 1.  defining the variable


    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/burgers");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        Application application = new Application(dataSource);
        application.run();
    }

    public Application(DataSource dataSource) {
        //todo: do DAO stuff
        menuItemDAO = new JDBCMenuItemItemDAO(dataSource);     // 2.  instantiating the dao and passing it the datasource object



    }

    private void run() {
        System.out.println("Do stuff");


        MenuItem foundItem = menuItemDAO.retrieveMenuItemById(1);
        if (foundItem != null) {
            System.out.println(foundItem.getCategoryName() + " " + foundItem.getName() + " " + foundItem.getPrice());
        }

        foundItem = menuItemDAO.retrieveMenuItemByName("Bacon Cheeseburger");
        if (foundItem != null) {
            System.out.println(foundItem.getCategoryName() + " " + foundItem.getName() + " " + foundItem.getPrice());
        }

        List<MenuItem> items = menuItemDAO.retrieveMenuItems();
        if (items != null) {
            System.out.println("We found " + items.size() + " items");
        }

        MenuItem item = new MenuItem();
        item.setCategoryName("Sides");
        item.setDescription("Fried pickles battered in beer batter with a side of beers");
        item.setName("Fried Pickles");
        item.setPrice(20.99);

        item = menuItemDAO.createMenuItem(item);
        System.out.println("Item " + item.getId() + " " + item.getName() + " was added");


        item.setDescription("Oops, only pickles are included. We have sacked the prior employeee giving away beers");
        item.setPrice(25.99);

        item = menuItemDAO.updateMenuItem(item);

        try {
            menuItemDAO.deleteMenuItem(8);
        }
        catch(DaoException e) {

            System.out.println(e.getCause().getMessage());
        }
        catch(ItemNotFoundException e) {
            System.out.println("Item not found");
        }


    }



}
