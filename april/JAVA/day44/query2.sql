## find departement wise avg salaries
select deptno, avg(sal)
from emp
group by deptno;