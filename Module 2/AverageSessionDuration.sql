SELECT
    e.title AS event_title,
    e.event_id,
    AVG(TIMESTAMPDIFF(MINUTE, s.start_time, s.end_time)) AS average_session_duration_minutes
FROM
    Events e
JOIN
    Sessions s ON e.event_id = s.event_id
GROUP BY
    e.event_id, e.title;