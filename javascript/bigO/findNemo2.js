// Making our code efficient
// By breaking out of the code, instead of running according to the 
// length/size of the data, it stops running immediately it find the expected outcome.

const nemo2 = ['nemo', 'dan', 'niel', 'joe'];
function foundNemo(array) {
    for (let i = 0; i < nemo2.length; i++) {
        if (nemo2[i] === 'nemo') {
            console.log('Found NEMO!');
            break;
        }
    }
}
foundNemo(nemo2);
