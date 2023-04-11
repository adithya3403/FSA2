## find out the employee names whose Salaries are more than the employee BLAKE.
select ename
from emp
where sal > (
        select sal
        from emp
        where ename = 'BLAKE'
    );