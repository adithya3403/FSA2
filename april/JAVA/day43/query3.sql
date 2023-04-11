## Find out the employee names  whose Jobs are same as ALLEN.
select ename
from emp
where job in (
        select job
        from emp
        where ename = "ALLEN"
    );