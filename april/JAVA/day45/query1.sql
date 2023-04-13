## Display all details of employee of highest paid.
select *
from emp
where sal = (
        select max(sal)
        from emp
    );