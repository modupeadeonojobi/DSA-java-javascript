// Time complexity is O(n) or linear time ie, BigO of n.  GOOD
// By linear time or BigO of n, the operation will increase as the input increases.
// for loops, while loops through n items
const nemo = ['nemo'];
function foundNemo(array) {
    for (let i = 0; i < nemo.length; i++) {
        if (nemo[i] === 'nemo') {
            console.log('Found NEMO!');
        }
    }
}
foundNemo(nemo);


// Time complexity is O(1) or constant time ie, BigO of n. EXCELLENT
// No matter the size of the array, the operation will always be 1 ie, constant time.
// No loop
const names = ['John', 'Doe', 'Jane'];
function findJohn(array) {
    console.log(array[0]);
}
findJohn(names);