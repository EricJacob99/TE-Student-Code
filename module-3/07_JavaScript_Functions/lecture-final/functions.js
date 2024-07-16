
//named function
function add(x,y) {
    return x + y;
}


/**
 * 
 * @param {number} x 
 * @param {number} y 
 * @returns - Numeric value which is the product of x and y
 */
function multiply(x,y) {
    return x * y;
}

multiply(3,4);


//console.log(add(2,2));
//console.log(multiple(2,3));

function onClick(func, num1, num2) {
    console.log(func(num1, num2));
}

onClick(add, 4, 4);
onClick(multiply, 4,4);

//We can assign a whole function to a variable (functional expression)
let addMe =  (x,y,z=0) => {
    return x+y+z;
}

console.log(addMe(8,3));



