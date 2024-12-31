CREATE TABLE order (
    id BIGINT PRIMARY KEY,
    product_id BIGINT,
    quantity INT
);

-- Insert orders (assuming product ids 1 and 2 exist)
INSERT INTO order (id, product_id, quantity) VALUES (1, 1, 2);
INSERT INTO order (id, product_id, quantity) VALUES (2, 2, 3);
