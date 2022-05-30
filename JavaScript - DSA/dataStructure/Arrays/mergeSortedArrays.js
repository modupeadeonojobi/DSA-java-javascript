const arr1 = [0, 3, 4, 31];
const arr2 = [4, 6, 30];

function mergeSortedArrays(arr1, arr1) {

    let low = 0;

    let combineSortedArray = [];

    for (let i = 0; i < arr2.length; i++) {
        arr1.push(arr2[i])
    }

    for (let j = 0; j < arr1.length; j++) {
        if (arr1[j] < arr1[j++]) {
            combineSortedArray.push(arr1[j]);

        }
        combineSortedArray.push(arr1[j++]);

    }
    arr1.sort();
    console.log(arr1);

}

mergeSortedArrays(arr1, arr1) 
