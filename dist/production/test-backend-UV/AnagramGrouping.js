function sortString(s) {
    let charArray = s.split('');

    for (let i = 0; i < charArray.length - 1; i++) {
        for (let j = i + 1; j < charArray.length; j++) {
            if (charArray[i] > charArray[j]) {
                let temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
        }
    }

    return charArray.join('');
}

function groupAnagrams(words) {
    let anagramObj = {};

    for (let word of words) {
        let sortedWord = sortString(word);

        if (anagramObj[sortedWord]) {
            anagramObj[sortedWord].push(word);
        } else {
            anagramObj[sortedWord] = [word];
        }
    }

    return Object.values(anagramObj);
}

//let words = ["listen", "pot", "part", "opt", "trap", "silent", "top"];
let words = ["listen", "potato", "tomato", "dog", "god", "taco", "cat", "act", "racecar"]
console.log(groupAnagrams(words));