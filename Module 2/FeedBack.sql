SELECT
    e.title AS event_title,
    e.event_id
FROM
    Events e
JOIN
    Registrations r ON e.event_id = r.event_id
LEFT JOIN
    Feedback f ON e.event_id = f.event_id
WHERE
    f.feedback_id IS NULL
GROUP BY
    e.event_id, e.title;
