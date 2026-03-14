# create a table : 
```
CREATE TABLE Department (
    Dept_ID INT PRIMARY KEY,
    Dept_Name VARCHAR(50)
);
```
# foreign key : 
```
CREATE TABLE Student (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50),
    Dept_ID INT,
    FOREIGN KEY (Dept_ID) REFERENCES Department(Dept_ID)
);
```

# CRUD : 
```
INSERT INTO Department VALUES (1, 'Computer Science');
UPDATE Student SET Marks = Marks + 5;
DELETE FROM Student WHERE Marks < 40;


```

# Readig values : 

```
SELECT * FROM Student;
SELECT Student_Name FROM Student;

// read unique values ; 
SELECT DISTINCT Dept_ID FROM Student;

// basic filtering :
SELECT * FROM Student WHERE Marks > 80;

// pattern matching :
SELECT * FROM Student WHERE Name LIKE 'M%a';
SELECT * FROM Student WHERE Name LIKE '%e%';

```


# Grouping data 

```
SELECT Dept, COUNT(*) AS Total_Students FROM Student GROUP BY Dept;
```

# counting unique data : 
```
SELECT Dept FROM Student GROUP BY Dept HAVING COUNT(DISTINCT HOD) = 1;
```

# altering column property : 
```
alter table employee modify emp_id int auto_increment;

update employee set basic_salary = basic_salary * 1.1 where  name = 'Rahul';
```






