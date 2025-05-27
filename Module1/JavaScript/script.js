// Sample data: events
const events = [
  {
    id: 1,
    title: "Community Clean-Up",
    date: "2025-06-10",
    category: "Environment",
    description: "Join us to clean up the park and surrounding areas.",
    registered: false
  },
  {
    id: 2,
    title: "Tech Talk: Web Dev Trends",
    date: "2025-06-15",
    category: "Technology",
    description: "Discuss the latest trends in web development with experts.",
    registered: false
  },
  {
    id: 3,
    title: "Yoga in the Park",
    date: "2025-06-18",
    category: "Health",
    description: "Relax and stretch in a peaceful morning yoga session.",
    registered: false
  }
];

// Initial render of all events
function renderEvents(filter = "All") {
  const container = document.getElementById("events-container");
  container.innerHTML = "";

  const filteredEvents = filter === "All" ? events : events.filter(e => e.category === filter);

  if (filteredEvents.length === 0) {
    container.innerHTML = "<p>No events found.</p>";
    return;
  }

  filteredEvents.forEach(event => {
    const eventCard = document.createElement("div");
    eventCard.className = "event-card";

    eventCard.innerHTML = `
      <h3>${event.title}</h3>
      <p><strong>Date:</strong> ${event.date}</p>
      <p><strong>Category:</strong> ${event.category}</p>
      <p>${event.description}</p>
      <button onclick="registerEvent(${event.id})" ${event.registered ? "disabled" : ""}>
        ${event.registered ? "Registered" : "Register"}
      </button>
    `;

    container.appendChild(eventCard);
  });
}

// Register for event
function registerEvent(id) {
  const event = events.find(e => e.id === id);
  if (event && !event.registered) {
    event.registered = true;
    alert(`You have successfully registered for "${event.title}"`);
    renderEvents(document.getElementById("filter").value);
  }
}

// Filter handler
function handleFilterChange() {
  const filterValue = document.getElementById("filter").value;
  renderEvents(filterValue);
}

// Initialize
document.addEventListener("DOMContentLoaded", () => {
  // Setup filter dropdown if needed
  const filterSelect = document.getElementById("filter");
  if (filterSelect) {
    filterSelect.addEventListener("change", handleFilterChange);
  }

  renderEvents();
});
