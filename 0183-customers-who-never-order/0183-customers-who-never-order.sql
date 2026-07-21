# Write your MySQL query statement below
SELECT S.name AS Customers 
FROM Customers AS S
left JOIN Orders AS O
ON S.id =  O.customerId
WHERE O.customerId IS NULL;