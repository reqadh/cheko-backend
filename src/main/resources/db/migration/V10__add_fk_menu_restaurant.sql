ALTER TABLE menu
ADD CONSTRAINT menu_restaurant_id_fkey
FOREIGN KEY (restaurant_id)
REFERENCES restaurants(id)
ON DELETE SET NULL;
