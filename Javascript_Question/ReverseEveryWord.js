// A. Take a sentence as an input and reverse every word in that sentence. 
// a. Example - This is a sunny day > shiT si a ynnus yad. 

function reverseWords(sentence) {
    let reversedWords = [];
    let currentWord = '';

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
   
            if (i === sentence.length - 1) {
                currentWord += sentence[i];
            }
            let reversedWord = '';
            for (let j = currentWord.length - 1; j >= 0; j--) {
                reversedWord += currentWord[j];
            }
            reversedWords.push(reversedWord);
            currentWord = '';
        } else {
            currentWord += sentence[i];
        }
    }

    // Join the reversed words to form the reversed sentence
    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);//Reversed Sentence: sihT si a ynnus yad