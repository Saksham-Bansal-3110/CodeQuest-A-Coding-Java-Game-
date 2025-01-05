document.addEventListener("DOMContentLoaded", function () {
    const startGameButton = document.getElementById("start-game-btn");

    if (startGameButton) {
        startGameButton.addEventListener("click", function () {
            window.location.href = "levels.html"; // Redirect to the level selection page
        });
    } else {
        console.error("Start Game button not found!");
    }
});
document.addEventListener("DOMContentLoaded", function () {
    const statsButton = document.getElementById("stats-btn");
    statsButton.addEventListener("click", function () {
        window.location.href = "menu.html"; // Navigate to menu.html
    });
});

