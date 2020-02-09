function reverseString(x) {
    var a = 0;
    var b = x.length - 1;
    var s = x.split("");
    while (a < b) {
        var temp = s[a];
        s[a] = s[b];
        s[b] = temp;
        a++;
        b--;
    }
    console.log(s.join(""));
}


reverseString("ashit");