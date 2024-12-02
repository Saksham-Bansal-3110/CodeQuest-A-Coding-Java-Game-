// Wait for the DOM to load before running the script
document.addEventListener("DOMContentLoaded", function () {
    // Select the Start Game button
    const startGameButton = document.getElementById("start-game-btn");

    // Check if the button exists
    if (startGameButton) {
        startGameButton.addEventListener("click", function () {
            // Redirect to the level selection page or perform an action
            window.location.href = "/levels.html"; // Adjust the URL as needed
        });
    } else {
        console.error("Start Game button not found!");
    }
});

