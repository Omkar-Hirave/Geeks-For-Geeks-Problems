function rearrangeArrayBySign(nums) { 
    let result = new Array(nums.length).fill(0);
    let positiveIndex = 0;
    let negativeIndex = 1;
  
    for (let i = 0; i < nums.length; i++) {
      const currentElement = nums[i];
  
      if (currentElement < 0) {
        result[negativeIndex] = currentElement;
        negativeIndex = negativeIndex + 2;
      } else {
        result[positiveIndex] = currentElement;
        positiveIndex = positiveIndex + 2;
      }
    }
    return result;
  }
  
  const nums = [1, 2, -4, -5];
  const result = rearrangeArrayBySign(nums);
  
  console.log(result.join(" "));
  