// MP15 - Export first 50 rows to new CSV file

const fs = require("fs");
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter CSV file path: ", function(inputPath) {

  rl.question("Enter output file name: ", function(outputPath) {

    try {
      const data = fs.readFileSync(inputPath, "utf8");
      const rows = data.split("\n");

      const first50 = rows.slice(0, 50).join("\n");

      fs.writeFileSync(outputPath, first50);

      console.log("\nFirst 50 rows exported successfully.");

    } catch (error) {
      console.log("Error:", error.message);
    }

    rl.close();
  });

});