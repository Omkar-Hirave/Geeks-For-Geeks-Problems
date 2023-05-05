function maximumAndminimum(nums){
    let maximum = nums[0]
    let minimum = nums[0]
    for(let i = 0 ; i < nums.length ; i++){
        if(maximum < nums[i]){
            maximum = nums[i]
        }
        if(minimum > nums[i]){
            minimum = nums[i]
        }
    }
    return [ maximum,minimum ]
}
nums = [3, 5, 41, 1, 9]
console.log(maximumAndminimum(nums));