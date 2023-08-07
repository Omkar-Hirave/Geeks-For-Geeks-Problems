function findOccurrences(nums) {
    let occurrences = new Map();
    for (let i = 0; i < nums.length; i++) {
      if (occurrences.has(nums[i])) {
        occurrences.set(nums[i], occurrences.get(nums[i]) + 1);
      } else {
        occurrences.set(nums[i], 1);
      }
    }
    console.log("Occurrences:");
    for (let [num, count] of occurrences) {
      if (count === 1) {
        console.log(num + " occurs " + count + " time(s)");
      }
    }
    // return occurrences;
  }
  
  const nums = "My Name is Omkar Ashok Hirave";
  console.log(nums);
  console.log(findOccurrences(nums));
  

  