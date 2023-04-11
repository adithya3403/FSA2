## find deptnumbers which are having more than 4 employees
select count(*)
from emp
group by deptno
having count(*) > 4;