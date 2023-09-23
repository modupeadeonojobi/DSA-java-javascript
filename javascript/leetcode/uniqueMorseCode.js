var uniqueMorseRepresentations = function(words) {
  let resarr = new Set()
  for(let i=0;i<words.length;i++)
  {
      let code =''
      for(let j=0;j<words[i].length;j++)
      {
          code += Morse_Code_Map[words[i][j]]
      }
      resarr.add(code)
  }
  return resarr.size
};

const Morse_Code_Map = {
"a": ".-",
"b": "-...",
"c": "-.-.",
"d": "-..",
"e": ".",
"f": "..-.",
"g": "--.",
"h": "....",
"i": "..",
"j": ".---",
"k": "-.-",
"l": ".-..",
"m": "--",
"n": "-.",
"o": "---",
"p": ".--.",
"q": "--.-",
"r": ".-.",
"s": "...",
"t": "-",
"u": "..-",
"v": "...-",
"w": ".--",
"x": "-..-",
"y": "-.--",
"z": "--.."
}


let words = ["gin","zen","gig","msg"];
let result = uniqueMorseRepresentations(words)
console.log(result);