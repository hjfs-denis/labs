set serveroutput on;

--create an anonymous block to print "Today is Tuesday".

begin
    dbms_output.put_line('Today is Tuesday');
end;
/


--create an anonymous block to print today's date.

declare 
    var_date date;
begin 
    select sysdate into var_date from dual;
    DBMS_OUTPUT.PUT_LINE('Todays' ||var_date);
end;
/


--create a table which stores product details (p_id, product_name, price).
--Display the price based on productId
--productId will be stored in a pl/sql variable.

create table product (p_id number, product_name varchar2(30), price number);

begin
    insert into product values (101, 'Apple', 68000);
    insert into product values (102, 'Samsung', 55000);
    insert into product values (103, 'Xiomi', 17000);
    insert into product values (104, 'OPPO', 25000);
    insert into product values (105, 'One Plus', 46000);
    commit;
end;
/

select * from product;

declare
v_product_id product.p_id%type := &product_id;
v_price product.price%type;
begin
    select price into v_price from product where p_id = v_product_id;
    dbms_output.put_line('The price of ' || v_product_id || ' is ' || v_price);
end;
/

