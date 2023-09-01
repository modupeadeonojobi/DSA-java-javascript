const array1 = ['a', 'b', 'c', 'd', 'e'];
const array2 = ['y', 'v', 'z'];

const arr1 = ['a', 'b', 'c', 'd', 'e'];
const arr2 = ['f', 'u', 'd'];

const findPair = (arr1, arr2) => {
  let map = {};
  for (let i = 0; i < arr1.length; i++) {
    //index i doesn't exist in object. E.g map[a] does not exist run the code below
    if (!map[arr1[i]]) {
      let key = arr1[i];
      map[key] = true;
    }
  }

  for (let j = 0; j < arr2.length; j++) {
    //index j exist in object.
    if (map[arr2[j]]) {
      return true;
    }
  }
  return false;
};
const pair = findPair(arr1, arr2);
console.log(pair);

/*==========================================================
Using javascript function 'includes'
===========================================================*/
const findCommonItems = (arr1, arr2) => {
  for (let i = 0; i < arr1.length; i++) {
    if (arr2.includes(arr1[i])) {
      return true;
    }
  }
  return false;
};

const result = findCommonItems(arr1, arr2);
console.log(result);

/*==========================================================
A more concise approach will be
===========================================================*/
const findCommonItems2 = (arr1, arr2) => {
  if (!arr1 instanceof Array) {
    return;
  }

  return arr1.some((item) => arr2.includes(item));
};

const result2 = findCommonItems2(arr1, arr2);
console.log(result);
