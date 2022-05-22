// Test case 1
const array1 = ['a', 'b', 'c', 'd'];
const array2 = ['x', 'y', 'z'];


// Test case 2
const arr1 = ['a', 'b', 'c', 'x'];
const arr2 = ['x', 'y', 'z'];


// ================================== (1) =====================================
// This is the brute force approach to solving this problem, it isn't efficient.
// The time complexity is O(a * b).
// Yeah, it's a nested loop. It's horrible, never use this.
function findSameItem(array1, array2) {
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            if (array1[i] === array2[j]) {
                return true;
            } 
        }
    }
    return false;
}

const containItem = findSameItem(arr1, arr2);
// console.log(containItem);


// ================================== (2) =====================================
// This is rather a more efficient way of solving the problem;
function containSameItem(arr1, arr2) {

    let map = {};

    for (let i = 0; i < arr1.length; i++) {
        if (!map[arr1[i]]) {
           const item = arr1[i];
           map[item] = true;
        }
        
    }
  

    for (let j = 0; j < arr2.length; j++) {
        if (map[arr2[j]]) {
            return true;
        }
    }
    return false;
}

const doesItContain = containSameItem(arr1, arr2);
// console.log(doesItContain);


// ================================== (3) =====================================
// Using built-in javascript method
function containSameItem2(arr1, arr2) {
    return arr1.some(item => item.includes(arr2));

    // Foreach can also be used here.
    return arr1.forEach(element => element.includes(arr2));
}

const doesItContainSame = containSameItem(arr1, arr2);
console.log(doesItContainSame);