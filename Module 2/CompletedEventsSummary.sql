SELECT
    e.title AS event_title,
    COUNT(DISTINCT r.user_id) AS total_registrations,
    AVG(f.rating) AS average_feedback_rating
FROM
    Events e
LEFT JOIN
    Registrations r ON e.event_id = r.event_id
LEFT JOIN
    Feedback f ON e.event_id = f.event_id
WHERE
    e.status = 'completed'
GROUP BY
    e.event_id, e.title;
