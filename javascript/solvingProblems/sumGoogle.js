const arr1 = [1, 2, 3, 4, 5];
const arr2 = [1, 2, 3, 4, 4];

const target = 8;


// ================================== (1) =====================================
// Brute force approach
function findSumOfTarget(arr1, sum) {
    for (let i = 0; i < arr1.length - 1; i++) {
        for (let j = 0; j < i + 1; j++) {
            if (arr1[i] + arr1[j] === sum) {
                return true;
            }
        }
    }
    return false;
}

const haveSum = findSumOfTarget(arr1, target);
console.log(haveSum);



// ================================== (2) =====================================
// Effiecient approach of solving the challenge
function findSumOfTarget2(arr1, sum) {
    const mySet = new Set();

    for (let i = 0; i < arr1.length; i++) {
        if (mySet.has(arr1[i])) {
            return true;
        }
        mySet.add(sum - arr1[i])
    }
    return false;
}

const haveSum2 = findSumOfTarget2(arr1, target);
console.log(haveSum2);
