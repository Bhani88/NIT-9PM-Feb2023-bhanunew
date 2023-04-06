show databases;

create database NIT9PMFeb23;

use NIT9PMFeb23;

create table employee (sno int, name varchar(40),empId  int, location varchar(50), designation varchar(50), salary int, joiningDate datetime);

create table employee_salary(sno int, name varchar(40),empId int, salary int, experience int);

show tables;

insert into employee values (1,"Sachin Tendulkar",1234,"Mumbai","Senior Director",2000000, now());

insert into employee values (2,"Rahul Dravid",2345,"Bengaluru","Director",1000000, now());

insert into employee values (1,"MS Dhoni",3456,"Chennai","Senior Manager",1000000, now());

insert into employee values (1,"Virat Kohli",4567,"Delhi","Associate",100000, now());

insert into employee values (1,"KL Rahul",5678,"Hyderabad","Junior Associate",50000, now());

insert into employee values (1,"Manish Pandey",5678,"Hyderabad","Junior Associate",50000, now());

insert into employee values (1,null,6789,"Viazg","Associate",50000,now());

create table employee_unique (sno int, name varchar(40),empId  int, location varchar(50), designation varchar(50), salary int, joiningDate datetime,primary key(empId));

insert into employee_unique values (1,"KL Rahul",5678,"Hyderabad","Junior Associate",50000, now());

insert into employee_unique values (1,"Manish Pandey",5678,"Hyderabad","Junior Associate",50000, now());

insert into employee_unique values (1,"Manish Pandey",56788,"Hyderabad","Junior Associate",50000, now());

insert into employee_unique (name, empId, location) values ("Sanju Samson",1234,"Trivandrum");

insert into employee_unique (name, empId, designation) values ("Suresh Raina",2345,"Kanpur");

show columns from employee;

select * from employee;

select name, empId, designation from employee;

select name, designation, salary from employee;

select * from employee where name = "Virat Kohli";

select * from employee where salary = 1000000;

select * from employee where salary < 100000;

select * from employee where salary > 100000;

select * from employee where salary >= 100000;

select * from employee where salary <= 100000;

select * from employee where joiningDate = "2023-02-24 21:39:13";

select * from employee where location != "Delhi";

select * from employee where joiningDate > "2023-02-23";

select * from employee where sno is not null;

select name, empId, designation from employee where sno is not null;

select * from employee where name is null;

select * from employee where location is true;

select * from employee where salary between 100000 and 2000000;

select * from employee where salary not between 100000 and 1000000;

select * from employee where salary in (100000,50000,2000000);

select * from employee where salary not in (100000,50000,2000000);

select * from employee where salary >10000 and salary < 100000;

select * from employee where salary >10000 and salary < 40000;

select * from employee where salary >10000 or salary < 100000;

select * from employee where salary >10000 or salary < 40000;

select * from employee where name like "%Singh";

select * from employee where name like "Sai%";

select * from employee where salary > 1000 order by name;

select * from employee where salary > 1000 order by name desc;

select * from employee order by location;

select * from employee order by location desc;

select * from employee limit 1;

select * from employee limit 2;

select * from employee order by salary desc limit 1;

select * from employee order by salary desc limit 3,1;

select min(salary) from employee;

select max(salary) from employee;

select avg(salary) from employee;

select count(salary) from employee;

select sum(salary) from employee;

select distinct salary from employee;

update employee set name="Gambhir" where empId=6789;

update employee set location="Vizag" where name="Gambhir";

update employee set empId="56789", location="Indore" where name="Manish Pandey";

delete from employee where empId= 00000

truncate table emp;

drop table emp;

select name as CricketerName, empID as EmployeeID, location as Location from employee;

select name as NAME, empID as EMPLOYEEID, designation as JOBROLE from employee;

select employee.name, employee.salary,employee_unique.location from employee inner join employee_unique
on employee.location = employee_unique.location;

select employee.name, employee.salary,employee.location from employee left outer join employee_unique
on employee.location = employee_unique.location;

select employee_unique.name, employee_unique.salary,employee_unique.location from employee right outer join employee_unique
on employee.location = employee_unique.location;

select name, salary from employee union select location, designation from employee_unique;

select employee_unique.name, employee_unique.salary,employee_unique.location from employee full outer join employee_unique
on employee.location = employee_unique.location;
