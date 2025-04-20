ALTER TABLE menu
ADD COLUMN restaurant_id BIGINT;

-- Optional: If you already have restaurants and want to assign them,
-- you could do something like:
-- UPDATE menu SET restaurant_id = 1 WHERE id IN (1, 2, 3);
