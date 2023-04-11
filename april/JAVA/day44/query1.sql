## find deptnumbers which are having more than 4 employees
select deptno
from emp
group by deptno
having count(*) > 4;