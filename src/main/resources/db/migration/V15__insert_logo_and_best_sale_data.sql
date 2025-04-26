-- ✅ Set logo URLs and item counts for categories
UPDATE category SET logo_url = 'https://l.top4top.io/p_3399qf2zf5.png', item_count = 9 WHERE name = 'Breakfast';
UPDATE category SET logo_url = 'https://k.top4top.io/p_33994fxl84.png', item_count = 9 WHERE name = 'Drinks';
UPDATE category SET logo_url = 'https://j.top4top.io/p_3399x592e3.png', item_count = 9 WHERE name = 'Soups';
UPDATE category SET logo_url = 'https://i.top4top.io/p_3399zkda12.png', item_count = 9 WHERE name = 'Sushi';
UPDATE category SET logo_url = 'https://h.top4top.io/p_3399t1fo31.png', item_count = 9 WHERE name = 'Orders';

-- ✅ Clear all best_sale flags
UPDATE menu SET best_sale = FALSE;

-- ✅ Set best_sale = TRUE for 3 items per category (except Drinks)
WITH ranked_items AS (
    SELECT
        m.id,
        c.name AS category_name,
        ROW_NUMBER() OVER (PARTITION BY m.category_id ORDER BY m.id) AS rn
    FROM menu m
    JOIN category c ON m.category_id = c.id
    WHERE c.name != 'Drinks'
)
UPDATE menu
SET best_sale = TRUE
WHERE id IN (
    SELECT id FROM ranked_items WHERE rn <= 3
);
