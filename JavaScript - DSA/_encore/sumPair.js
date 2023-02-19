const items = [3, 6, 5, 7, 9];
const target = 8;

const pairSum = (items, target) => {
  for (let i = 0; i < items.length; i++) {
    for (let j = i + 1; j < items.length; j++) {
      if (items[j] + items[i] === target) {
        return true;
      }
    }
  }
  return false;
};

const result = pairSum(items, target);
console.log(result);
