// Simulated data fetched from a database
const playerData = {
    easy: 153,
    medium: 250,
    hard: 54,
    total: 457,
    daysPlayed: 208,
    maxStreak: 101,
    achievements: [
        "50 Days Badge 2022",
        "3-Month Streak",
        "4-Year Badge",
    ],
};

// Function to update the HTML content using the DOM
function updateStats(data) {
    document.getElementById("easy-count").textContent = data.easy;
    document.getElementById("medium-count").textContent = data.medium;
    document.getElementById("hard-count").textContent = data.hard;
    document.getElementById("total-count").textContent = data.total;
    document.getElementById("days-played").textContent = data.daysPlayed;
    document.getElementById("max-streak").textContent = data.maxStreak;

    const achievementsList = document.getElementById("achievements-list");
    data.achievements.forEach((achievement) => {
        const listItem = document.createElement("li");
        listItem.textContent = achievement;
        achievementsList.appendChild(listItem);
    });
}

// Call the function to load data into the page
updateStats(playerData);
