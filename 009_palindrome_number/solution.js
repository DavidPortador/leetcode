/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let n = x, r = 0, d = 10;
    if(n >= 0 && n < d){
        return true;
    }
    while(n > 0){
        let mod = n % d;
        n = Math.floor(n / d);
        r = r * d + mod;
    }
    return x == r;
};

function main (){
    console.log(isPalindrome(1001))
}

main()