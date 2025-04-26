
-- Clear old data
DELETE FROM menu;

-- Drinks
INSERT INTO menu (name, description, price, image_url, calories, category_id, lat, lng, restaurant_id) VALUES
('Fresh Orange Juice', 'Freshly squeezed oranges for a vibrant and refreshing taste.', 18.50, 'https://loremflickr.com/640/480/orange', 110, 2, 24.7136, 46.6753, 1),
('Iced Latte', 'Chilled espresso mixed with milk and ice for a perfect caffeine hit.', 22.00, 'https://loremflickr.com/640/480/coffee', 160, 2, 24.7137, 46.6755, 1),
('Green Smoothie', 'A blend of kale, banana, apple, and spinach. Packed with nutrients.', 26.00, 'https://loremflickr.com/640/480/smoothie', 180, 2, 24.7139, 46.6757, 1),
('Mango Mojito', 'Non-alcoholic mojito infused with ripe mango chunks.', 21.00, 'https://loremflickr.com/640/480/mango', 130, 2, 24.7133, 46.6750, 1),
('Mint Lemonade', 'Crushed mint leaves with fresh lemon juice and soda.', 17.50, 'https://loremflickr.com/640/480/lemonade', 100, 2, 24.7132, 46.6751, 1),
('Cold Brew', 'Slow-steeped cold brew for a strong and bold coffee taste.', 23.00, 'https://loremflickr.com/640/480/brew', 90, 2, 24.7134, 46.6752, 1),
('Caramel Milkshake', 'Rich vanilla shake with swirls of caramel.', 27.00, 'https://loremflickr.com/640/480/milkshake', 320, 2, 24.7135, 46.6756, 1),
('Strawberry Smoothie', 'Blended strawberries with yogurt and honey.', 24.00, 'https://loremflickr.com/640/480/strawberry', 210, 2, 24.7138, 46.6754, 1),
('Iced Matcha Latte', 'Japanese matcha green tea served with cold milk.', 25.00, 'https://loremflickr.com/640/480/matcha', 120, 2, 24.7140, 46.6758, 1);

-- Soups
INSERT INTO menu (name, description, price, image_url, calories, category_id, lat, lng, restaurant_id) VALUES
('Tomato Basil Soup', 'Creamy tomato soup garnished with fresh basil leaves.', 16.00, 'https://loremflickr.com/640/480/tomato_soup', 140, 3, 24.7136, 46.6753, 1),
('Chicken Corn Soup', 'Classic soup made with shredded chicken and sweet corn.', 18.00, 'https://loremflickr.com/640/480/chicken_soup', 190, 3, 24.7137, 46.6755, 1),
('Mushroom Cream Soup', 'Rich and creamy soup made with fresh mushrooms.', 20.00, 'https://loremflickr.com/640/480/mushroom', 220, 3, 24.7138, 46.6754, 1),
('Hot and Sour Soup', 'A tangy, spicy broth with veggies and tofu.', 17.00, 'https://loremflickr.com/640/480/hotsour', 160, 3, 24.7139, 46.6757, 1),
('Broccoli Cheddar Soup', 'Cheesy soup with tender broccoli florets.', 21.00, 'https://loremflickr.com/640/480/broccoli', 250, 3, 24.7133, 46.6750, 1),
('Pumpkin Soup', 'Smooth pumpkin puree with a touch of nutmeg and cream.', 18.50, 'https://loremflickr.com/640/480/pumpkin', 180, 3, 24.7132, 46.6751, 1),
('Lentil Soup', 'Wholesome lentils simmered with Middle Eastern spices.', 16.50, 'https://loremflickr.com/640/480/lentil', 200, 3, 24.7134, 46.6752, 1),
('Seafood Chowder', 'A rich soup loaded with shrimp, clams, and fish.', 28.00, 'https://loremflickr.com/640/480/chowder', 300, 3, 24.7135, 46.6756, 1),
('French Onion Soup', 'Caramelized onions in beef broth topped with cheesy toast.', 22.00, 'https://loremflickr.com/640/480/onion_soup', 230, 3, 24.7140, 46.6758, 1);

-- Sushi
INSERT INTO menu (name, description, price, image_url, calories, category_id, lat, lng, restaurant_id) VALUES
('Salmon Nigiri', 'Sliced raw salmon on vinegared rice.', 32.00, 'https://loremflickr.com/640/480/salmon', 210, 4, 24.7136, 46.6753, 1),
('Tuna Sashimi', 'Fresh slices of raw tuna.', 35.00, 'https://loremflickr.com/640/480/tuna', 200, 4, 24.7137, 46.6755, 1),
('Avocado Roll', 'Vegetarian roll with creamy avocado and rice.', 18.00, 'https://loremflickr.com/640/480/avocado', 180, 4, 24.7138, 46.6754, 1),
('California Roll', 'Crab, avocado, and cucumber wrapped in seaweed.', 28.00, 'https://loremflickr.com/640/480/california', 250, 4, 24.7139, 46.6757, 1),
('Dragon Roll', 'Shrimp tempura with spicy mayo and eel sauce.', 38.00, 'https://loremflickr.com/640/480/dragon', 300, 4, 24.7133, 46.6750, 1),
('Spicy Tuna Roll', 'Tuna with spicy mayo and sesame.', 30.00, 'https://loremflickr.com/640/480/spicy_tuna', 240, 4, 24.7132, 46.6751, 1),
('Eel Avocado Roll', 'Grilled eel and avocado drizzled with eel sauce.', 34.00, 'https://loremflickr.com/640/480/eel', 270, 4, 24.7134, 46.6752, 1),
('Rainbow Roll', 'Crab, avocado, and topped with assorted sashimi.', 40.00, 'https://loremflickr.com/640/480/rainbow', 320, 4, 24.7135, 46.6756, 1),
('Vegetable Roll', 'Cucumber, carrot, avocado and sprouts.', 20.00, 'https://loremflickr.com/640/480/veggie_roll', 150, 4, 24.7140, 46.6758, 1);

-- Orders (Main Dishes)
INSERT INTO menu (name, description, price, image_url, calories, category_id, lat, lng, restaurant_id) VALUES
('Grilled Chicken Platter', 'Marinated grilled chicken served with rice and salad.', 55.00, 'https://loremflickr.com/640/480/chicken_plate', 600, 5, 24.7136, 46.6753, 1),
('Beef Steak', 'Juicy grilled steak served with vegetables.', 79.00, 'https://loremflickr.com/640/480/steak', 750, 5, 24.7137, 46.6755, 1),
('Spaghetti Bolognese', 'Pasta with beef ragu sauce.', 48.00, 'https://loremflickr.com/640/480/spaghetti', 670, 5, 24.7138, 46.6754, 1),
('Seafood Pasta', 'Pasta tossed with shrimp, calamari, and creamy sauce.', 62.00, 'https://loremflickr.com/640/480/seafood_pasta', 590, 5, 24.7139, 46.6757, 1),
('Fried Chicken Meal', 'Crispy fried chicken with fries and coleslaw.', 45.00, 'https://loremflickr.com/640/480/fried_chicken', 800, 5, 24.7133, 46.6750, 1),
('Vegetarian Lasagna', 'Layers of pasta, vegetables, and cheesy béchamel.', 43.00, 'https://loremflickr.com/640/480/veggie_lasagna', 550, 5, 24.7132, 46.6751, 1),
('Burger Deluxe', 'Double patty burger with cheese and bacon.', 52.00, 'https://loremflickr.com/640/480/burger', 900, 5, 24.7134, 46.6752, 1),
('Chicken Shawarma Plate', 'Spiced chicken slices served with garlic sauce and rice.', 47.00, 'https://loremflickr.com/640/480/shawarma', 640, 5, 24.7135, 46.6756, 1),
('BBQ Ribs', 'Slow-cooked ribs smothered in BBQ sauce.', 70.00, 'https://loremflickr.com/640/480/ribs', 880, 5, 24.7140, 46.6758, 1);

-- Breakfast
INSERT INTO menu (name, description, price, image_url, calories, category_id, lat, lng, restaurant_id) VALUES
('Pancakes with Syrup', 'Fluffy pancakes topped with butter and maple syrup.', 32.00, 'https://loremflickr.com/640/480/pancakes', 520, 1, 24.7131, 46.6749, 1),
('Classic Omelette', 'Three-egg omelette with cheese, mushrooms, and tomatoes.', 28.00, 'https://loremflickr.com/640/480/omelette', 430, 1, 24.7132, 46.6750, 1),
('French Toast', 'Bread slices soaked in egg and milk, fried golden and dusted with sugar.', 30.00, 'https://loremflickr.com/640/480/french_toast', 450, 1, 24.7133, 46.6751, 1),
('Avocado Toast', 'Toasted bread topped with smashed avocado and chili flakes.', 26.00, 'https://loremflickr.com/640/480/avocado_toast', 380, 1, 24.7134, 46.6752, 1),
('Foul Medames', 'Traditional Egyptian dish made with fava beans, garlic, lemon, and olive oil.', 18.00, 'https://loremflickr.com/640/480/foul', 400, 1, 24.7135, 46.6753, 1),
('Labneh with Olive Oil', 'Creamy labneh cheese drizzled with olive oil and mint.', 15.00, 'https://loremflickr.com/640/480/labneh', 220, 1, 24.7136, 46.6754, 1),
('Shakshuka', 'Poached eggs cooked in spicy tomato and pepper sauce.', 29.00, 'https://loremflickr.com/640/480/shakshuka', 390, 1, 24.7137, 46.6755, 1),
('Manakeesh Zaatar', 'Flatbread topped with thyme, sesame seeds, and olive oil.', 12.00, 'https://loremflickr.com/640/480/manakeesh', 280, 1, 24.7138, 46.6756, 1),
('Fruit Bowl', 'Seasonal fruits chopped fresh and served chilled.', 22.00, 'https://loremflickr.com/640/480/fruit_bowl', 160, 1, 24.7139, 46.6757, 1);
