document.addEventListener("DOMContentLoaded", function () {
    // Select all elements with the class 'level-btn'
    const levelButtons = document.querySelectorAll(".level-btn");

    // Loop through each button and add an event listener
    levelButtons.forEach(button => {
        button.addEventListener("click", function () {
            const level = button.getAttribute("level"); // Get the level from a data attribute
            if (level) {
                // Redirect to the editor page with the level as a query parameter
                window.location.href = `editor.html?level=${level}`;
            } else {
                console.error("No level attribute found for button.");
            }
        });
    });
});
