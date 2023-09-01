const nums = [2, 5, 1, 2, 3, 5, 1, 2, 4];



function firstRecurringChar(nums) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i++; j < nums.length; j++) {
            if (nums[i] === nums[j]) return nums[i]
        }
    }

    return undefined;
}

const bruteForceSolution = firstRecurringChar(nums);
console.log(bruteForceSolution);


function firstRecurringNum(nums) {
    let allNums = {};

    for (let i = 0; i < nums.length; i++) {
        if (allNums[nums[i]]) {
            return nums[i];
        } else {
            allNums[nums[i]] = i
        }   
    }

    return undefined;
}

const hastTable = firstRecurringChar(nums);
console.log(hastTable);