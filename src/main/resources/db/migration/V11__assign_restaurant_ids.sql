-- Assign restaurant_id to existing menu items
UPDATE menu SET restaurant_id = 1 WHERE id IN (1, 2, 3);
UPDATE menu SET restaurant_id = 2 WHERE id IN (4);
UPDATE menu SET restaurant_id = 3 WHERE id IN (5);
