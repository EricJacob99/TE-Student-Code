console.log('Hello World!');


let names = ['Alex', 'Conner', 'Madeline', 'Nick'];
console.log(names);

// let x = names.length;
// console.log('The length is: ' + x);

names.push('Gabby');
console.log(names);

console.log(names[2]);
names = names.reverse();
console.log(names);


for (let i=0; i< names.length; i++) {
    console.log(names[i]);
}

let x = 0;
let y = 'false';

if (x == y) {
    console.log('OK');
}
else {
    console.log('BAD');
}


const variableName = undefined;
console.log(variableName);
// variableName = 'Some test this is...';
// console.log(variableName);


function add(num1,num2) {
   return num1 + num2;
}

let result = add(2,2);
console.log(result);

result = add(3, add(2,2));
console.log(result);

let myNum = add;

console.log(myNum(myNum(myNum(3,4) , myNum(4,5)) , myNum(9,10)));