// MP13 - Detect rows with missing values

const fs = require("fs");
const readline = require("readline");

// Ask user for file path
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter CSV file path: ", function(path) {

  try {
    const data = fs.readFileSync(path, "utf8");
    const rows = data.split("\n");

    console.log("\nRows with missing values:");

    rows.forEach((row, index) => {
      const values = row.split(",");

      const hasMissing = values.some(v => v.trim() === "");

      if (hasMissing) {
        console.log(`Row ${index + 1}: ${row}`);
      }
    });

  } catch (error) {
    console.log("Error reading file:", error.message);
  }

  rl.close();
});