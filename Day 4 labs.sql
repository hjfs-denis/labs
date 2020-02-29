select * from employees;
drop table employees;

--For the department 80, print the max, min, avg, count of commission_pct

select  max(commission_pct), 
        min(commission_pct), 
        avg(commission_pct), 
        count(commission_pct)
from employees 
where department_id = 80;


--Grading employee salaries
    --accpet employee id
    --sort the salary as low <10000, average (between 10000 and 20000) and high (greater than 20000)
    --Print : Employee <First_Name> Salary Grade <>
    
declare
    v_employee_id employees.employee_id%type := &EmployeeID;
    v_salary number;
begin
    select salary into v_salary from employees where employee_id = v_employee_id;
    if v_salary < 10000 then
        dbms_output.put_line('Salary is low.');
    elsif v_salary between 10000 and 20000 then
        dbms_output.put_line('Salary is average.');
    else
        dbms_output.put_line('Salary is high.');
    end if;
end;
/


--Write a loop to print the number from 10 to 1 in reverse.

begin
    for i in reverse 1..10
    loop
        dbms_output.put_line(i);
    end loop;
end;
/


--Make a copy of regions table
    --insert 3 regions using a procedure.
    --print the number of rows inserted using sql implicit cursor.
    
create table d_regions as 
select * from regions where 1 = 2;

select * from d_regions;

create or replace procedure p_region_insert(v_region_id regions.region_id%type, 
                                            v_region_name regions.region_name%type)
is
begin
    insert into regions values (v_region_id, v_region_name);
    dbms_output.put_line('Row Count :' || sql%rowcount);
    commit;
end;
/

begin
    p_region_insert(5,'Chennai');
    p_region_insert(6,'Tirunelveli');
    p_region_insert(7,'Tuticorin');
end;
/



--CREATE a procedure, invoke the below function and display the result.
    --CREATE OR REPLACE FUNCTION FIRSTFUNCTION RETURN NUMBER IS BEGIN RETURN 5; END;

CREATE OR REPLACE FUNCTION FIRSTFUNCTION 
RETURN NUMBER 
IS 
BEGIN 
    RETURN 5; 
END;
/


create or replace procedure p_FIRSTFUNCTION
is
begin
    dbms_output.put_line('Value from function : ' ||FIRSTFUNCTION());
end;
/

begin
   p_FIRSTFUNCTION;
end;
/


-- Create a view 