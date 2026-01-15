DROP SCHEMA IF EXISTS "orders_schema" CASCADE;

CREATE SCHEMA "orders_schema";
CREATE TABLE "orders_schema".orders_table(
    orderId uuid NOT NULL
);

CREATE TABLE "orders_schema".order_product_table(
    orderId uuid NOT NULL,
    orderedProductId uuid NOT NULL,
    productName varchar(255),
    productQuantity INTEGER
);

CREATE TABLE "orders_schema".inventory_table(
    product_uuid uuid NOT NULL,
    product_name varchar(255) NOT NULL,
    product_quantity INTEGER
)