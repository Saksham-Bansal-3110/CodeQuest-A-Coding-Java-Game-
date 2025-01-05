document.addEventListener("DOMContentLoaded", function () {
    const testCases = {
        1: { input: ["hello"], expectedOutput: "olleh" },
        2: { input: [7], expectedOutput: true },
        3: { input: [5], expectedOutput: 120 },
        // Add more levels...
    };

    const submitButton = document.getElementById("submit-btn");
    const editor = document.getElementById("editor");
    const resultMessage = document.getElementById("result-message");

    // Get the 'level' parameter from the URL
    const urlParams = new URLSearchParams(window.location.search);
    const level = urlParams.get("level");

    // Set the question for the current level
    const questionText = document.getElementById("question-text");
    const questions = {
        1: "Write a function to reverse a string.",
        2: "Write a function to check if a number is prime.",
        3: "Write a function to calculate the factorial of a number.",
		4: "Write a function to calculate the Fibonacci sequence.",
	    5: "Write a function to sort an array.",
	    6: "Write a function to check if a string is a palindrome.",
	    7: "Write a function to find the greatest common divisor of two numbers.",
	    8: "Write a function to generate a random number between two values.",
	    9: "Write a function to flatten a nested array.",
	    10: "Write a function to count the vowels in a string.",
	    11: "Write a function to find the maximum and minimum in an array.",
	    12: "Write a function to merge two sorted arrays."
    };
    if (questions[level]) {
        questionText.textContent = questions[level];
    } else {
        questionText.textContent = "Invalid level. Please select a valid level.";
    }

    // Add click event to the Submit button
    submitButton.addEventListener("click", function () {
        if (!level || !testCases[level]) {
            resultMessage.textContent = "Invalid level or test case.";
            return;
        }

        const userCode = editor.value;

        try {
            // Create a function dynamically from user code
            const userFunction = new Function("input", userCode);

            // Run the function with test case input
            const userOutput = userFunction(testCases[level].input);

            // Compare user output with expected output
            if (userOutput === testCases[level].expectedOutput) {
                resultMessage.textContent = "Level Cleared!";
                resultMessage.style.color = "green";
            } else {
                resultMessage.textContent = "Level Failed.";
                resultMessage.style.color = "red";
            }
        } catch (error) {
            resultMessage.textContent = `Error in code: ${error.message}`;
            resultMessage.style.color = "red";
        }
    });
});

// Initialize CodeJar for the editor
const editorElement = document.getElementById('editor');
const highlight = (editor) => {
    const code = editor.textContent;
    editor.innerHTML = code
        .replace(/(\/\/.*)/g, '<span style="color: #75715e;">$1</span>') // Comments
        .replace(/(".*?")/g, '<span style="color: #e6db74;">$1</span>') // Strings
        .replace(/(\b(function|return|if|else|for|while|const|let|var|class|new)\b)/g, '<span style="color: #66d9ef;">$1</span>'); // Keywords
};
const jar = CodeJar(editorElement, highlight);
// Handle code submission
document.getElementById("submit-code").addEventListener("click", () => {
    const code = jar.toString();
    console.log("Submitted Code:", code);

    // Example: Send code to the backend
    fetch('/api/code', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ code })
    })
    .then(response => {
        if (response.ok) {
            alert("Code submitted successfully!");
        } else {
            alert("Submission failed.");
        }
    })
    .catch(error => console.error("Error:", error));
});
