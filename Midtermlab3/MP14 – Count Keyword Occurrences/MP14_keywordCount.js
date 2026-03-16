// MP14 - Count keyword occurrences

const fs = require("fs");
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter CSV file path: ", function(path) {

  rl.question("Enter keyword: ", function(keyword) {

    try {
      const data = fs.readFileSync(path, "utf8");
      const rows = data.split("\n");

      let count = 0;

      rows.forEach(row => {
        if (row.toLowerCase().includes(keyword.toLowerCase())) {
          count++;
        }
      });

      console.log(`\nKeyword '${keyword}' found in ${count} rows.`);

    } catch (error) {
      console.log("Error reading file:", error.message);
    }

    rl.close();
  });

});