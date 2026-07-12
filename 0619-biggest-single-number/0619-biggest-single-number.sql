# Write your MySQL query statement below
SELECT MAX(num) as num
FROM(sELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
) as num
;