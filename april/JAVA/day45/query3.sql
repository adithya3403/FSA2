## List all the emps except 'PRESIDENT' & 'MGR' in asc order of Salaries.
select *
from emp
where
    job not in ("PRESIDENT", "MANAGER")
order by sal asc;