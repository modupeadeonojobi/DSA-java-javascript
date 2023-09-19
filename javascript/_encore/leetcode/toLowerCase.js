const getLowerCaseString = (word) => {
  let result = '';

  for (let i = 0; i < word.length; i++) {
    // 65 - 90
    const char = word.charAt(i);
    if (char >= 'A' && char <= 'Z') {
      let ascii = char.charCodeAt(i) + 32;
      result += String.fromCharCode(ascii);

    } else {
      result += char;

    }
  }
  return result;
}

const word = 'Hello';
let result = getLowerCaseString(word);

console.log(result);

