function lengthOfLastWordJS(s){
     s = s.trim();
     var stringsArray = s.split(" ");
    return stringsArray[stringsArray.length-1].length;
}

console.log(lengthOfLastWordJS(" "));