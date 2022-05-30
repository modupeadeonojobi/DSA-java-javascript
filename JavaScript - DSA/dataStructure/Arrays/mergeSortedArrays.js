const arr1 = [0, 3, 4, 31];
const arr2 = [4, 6, 30];

function mergeSortedArrays(arr1, arr2) {
    const mergedArray = [];
    let arrayOneItem = arr1[0];
    let arrayTwoItem = arr2[0];
    let i = 1;
    let j = 1;

    if (arr2.length === 0) {
        return arr1;
    }

    if (arr1.length === 0) {
        return arr2;
    }

   
  // If you don't know the length of two arrays ie, 
  // you don't want to write rubbish code by checking 
  // the length of one array and checking the lenght of the other array,
  // use while loop

  while (arrayOneItem || arrayTwoItem) {
    if (!arrayTwoItem || arrayOneItem < arrayTwoItem) {
        mergedArray.push(arrayOneItem);
        arrayOneItem = arr1[i];
        i++;
    } else {
        mergedArray.push(arrayTwoItem)
        arrayTwoItem = arr2[j];
        j++;
    }
  }

  return mergedArray;

}

const mergedArray = mergeSortedArrays(arr1, arr2);
console.log(mergedArray);
