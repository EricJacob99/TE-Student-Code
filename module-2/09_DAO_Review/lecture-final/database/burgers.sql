-- Drop tables if they already exist
DROP TABLE IF EXISTS menu_items;
DROP TABLE IF EXISTS categories;

-- Create the categories table
CREATE TABLE categories (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL UNIQUE
);

-- Create the menu_items table
CREATE TABLE menu_items (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  price DECIMAL(5, 2) NOT NULL,
  category_id INTEGER REFERENCES categories(id)
);

-- Insert some sample data for menu items
INSERT INTO categories (name) VALUES ('Burgers'), ('Sides'), ('Drinks');

INSERT INTO menu_items (name, description, price, category_id) VALUES
 ('Classic Burger', 'A juicy all-beef patty with lettuce, tomato, onion, and pickles on a toasted bun', 8.99, 1),
 ('Cheeseburger', 'A classic burger with melted cheddar cheese', 9.99, 1),
 ('Bacon Cheeseburger', 'A cheeseburger topped with crispy bacon', 10.99, 1),
 ('French Fries', 'A side of crispy golden fries', 2.49, 2),
 ('Onion Rings', 'A side of crispy onion rings', 3.49, 2),
 ('Soda', 'A fountain soda (refillable)', 1.99, 3);
