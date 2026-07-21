# Write your MySQL query statement below
SELECT E.name  AS Employee 
FROM Employee AS E
JOIN Employee AS F
ON E.managerId = F.id
WHERE E.salary > F.salary;