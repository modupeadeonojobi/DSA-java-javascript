const str = 'Hello World';

// ================================== (1) =====================================
// Using for loop
function reverse(str) {

    if (!str || str.length < 2 || typeof str !==  'string') {
        return 'This is not a string';
    }

    let newStr = [];
    for (let i = str.length; i >= 0; i--) {
        newStr.push(str[i])
    }
   
    return newStr.join('');
}

const strReversed = reverse(str);
console.log(strReversed);


// ================================== (2) =====================================
// Using built-in javaScript method
function reverse2(str) {

    return str.split('').reverse().join('');
}

const strReversed2 = reverse2(str);
console.log(strReversed2);


// ================================== (3) =====================================
// Using ES6 function
const reverse3 = str => str.split('').reverse().join('');
                    // [...str].reverse().join('') - OR USING THE SPREAD OPERATOR

const strReversed3 = reverse3(str);
console.log(strReversed3);
