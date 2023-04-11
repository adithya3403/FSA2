## List all the emps except ‘PRESIDENT’ & ‘MGR” in asc order of Salaries. 
## List the columns (empno ename job mgr hiredate sal comm deptno)
select *
from emp
where
    job not in ("PRESIDENT", "MANAGER")
order by sal;