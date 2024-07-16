const daysOfWeek = ['Sun', 'Mon', 'Tues', 'Weds', 'Thurs', 'Fri', 'Satur'];

// FOR-EACH
//day is the only element that is required.
//  index is optional and only needed if you need to know the current index
//  daysOfWeek is optional and only needed if you need to reference another part of the whole array
daysOfWeek.forEach((day, index, daysOfWeek) => {
    
    if (index == 0) {
        console.table(daysOfWeek);
    }
    console.log(day + ' was found at index:' + index);
    
});

//FILTER
//element is the only element that is required.
//  index is optional and only needed if you need to know the current index
//  daysOfWeek is optional and only needed if you need to reference another part of the whole array
const daysThatStartWithT = daysOfWeek.filter((element) => {
       
    //inside a filter we need to check for some condition that returns true or false
    //  if true,  the filter method will add this element to the new array
    //  if false, it gets filtered out (not included)
      
    if (element.startsWith('T')) {
        return true;
    }

    return false;

});





console.table(daysThatStartWithT);




const numbers = [2.50, 3.50, 9.99, 12.76];

//REDUCE - aggregates all values to a single value
    // an argument to hold the intermediate/calculating value is required (like the runningTotal)
    // an argument to represent each element in the array (num)
    // index and array references are optional - not shown below
    // a starting value is the second argument after the callback function

const sum = numbers.reduce((runningTotal, num) => {

      return runningTotal += num;

}, 0);

console.log('The total of all numbers is: ' + sum);



//MAP 
const newDaysOfWeek = daysOfWeek.map((day) => {

    return day + 'day' + ' is a day of the week';


});

console.log(newDaysOfWeek);


const doubleValue = numbers.map((num) => {
    return num *2;
});

console.log(doubleValue);

const homes = [
    {
      zipCode: '43024',
      price: 200000  
    },
    {
        zipCode: '43024',
        price: 234000
    },
    {
     zipCode: '43017',
     price: 200001  
   },
   {
       zipCode: '43015',
       price: 234000
   }
 ];


 const foundHomes = homes.filter((homeElement) => {
         if(homeElement.zipCode == '43024') {
            return true;
         }
         return false;
 })
 
 console.log(foundHomes);








