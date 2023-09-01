// Time complexity is O(n^2) or quadratic time ie, BigO of n square.  HORRIBLE
// Two nested loops is multiplication ie O(n * n) and that becomes O(n^2)
const boxes = [1,2,3,4,5];

function logPairs(pairs) {    
    for (let i = 0; i < pairs.length; i++) {
        for (let j = 0; j < pairs.length; j++) {
            console.log(pairs[i], pairs[j]);
        }
    }
}

logPairs(boxes);