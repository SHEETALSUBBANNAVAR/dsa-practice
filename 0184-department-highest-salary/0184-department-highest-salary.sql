# Write your MySQL query statement below
SELECT D.name AS department ,E.name AS Employee  , E.salary 
FROM Employee  AS E
JOIN Department AS D 
ON D.ID  = E.departmentId  
WHERE E.salary = (
    SELECT MAX(salary)
    FROM Employee
    WHERE departmentId = E.departmentId
);