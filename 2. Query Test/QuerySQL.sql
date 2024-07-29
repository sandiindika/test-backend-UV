SELECT
    u1.id,
    u1.name,
    u2.name, AS parent_name
FROM
    users u1
LEFT JOIN
    users u2
ON
    u1.parent_id = u2.id;