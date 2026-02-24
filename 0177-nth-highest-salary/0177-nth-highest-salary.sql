CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE result INT;

    WITH ranked AS (
        SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
        FROM Employee
    )

    SELECT salary INTO result
    FROM ranked
    WHERE rnk = N
    LIMIT 1;

    RETURN result;
END;