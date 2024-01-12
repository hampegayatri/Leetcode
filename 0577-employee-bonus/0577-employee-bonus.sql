# Write your MySQL query statement below
select name, bonus 
from Employee 
    LEFT JOIN bonus 
ON employee.empID = bonus.empID
where bonus < 1000 
or bonus is null;


