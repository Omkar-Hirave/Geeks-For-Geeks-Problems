function leader(nums){
    let max = nums[nums.length-1]
    let result = []
    result.push(max)
    for(let i = nums.length-1 ; i >=0 ; i--){
        if(nums[i] > max){
            result.push(nums[i])
            max = nums[i]
        }
    }return result
}
let nums = [33,22,12,1,5,6]
console.log(leader(nums));