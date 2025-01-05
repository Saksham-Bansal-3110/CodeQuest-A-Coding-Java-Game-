document.addEventListener("DOMContentLoaded", () => {
    const scrollText = document.getElementById("scroll-text");
    const startGame = document.getElementById("start-game");
    
    
    // Wait for the animation to finish before showing the "Start Game" message
    scrollText.addEventListener("animationend", () => {
      startGame.classList.remove("hidden");
      startGame.classList.add("visible");
  
      // Listen for any key press to navigate to the next page
      document.addEventListener("keydown", () => {
        // Redirect to the next page (replace 'nextpage.html' with your URL)
        window.location.href = "levels.html";
      });
    });
  });
  