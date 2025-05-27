SELECT
    u.full_name,
    e.title AS event_title,
    e.start_date,
    e.city AS event_city
FROM
    Users u
JOIN
    Registrations r ON u.user_id = r.user_id
JOIN
    Events e ON r.event_id = e.event_id
WHERE
    e.status = 'upcoming'
    AND u.city = e.city
    AND e.start_date >= CURDATE() -- Assuming "upcoming" means events from today onwards
ORDER BY
    e.start_date;