-- grade: 0/100

## Display the location of the employee SMITH. 

select loc from dept, emp
where dept.deptno = emp.deptno
and emp.ename = 'SMITH';