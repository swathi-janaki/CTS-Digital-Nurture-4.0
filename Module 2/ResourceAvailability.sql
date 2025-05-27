SELECT
    e.event_id,
    e.title AS event_title
FROM
    Events e
LEFT JOIN
    Resources res ON e.event_id = res.event_id
WHERE
    res.resource_id IS NULL;