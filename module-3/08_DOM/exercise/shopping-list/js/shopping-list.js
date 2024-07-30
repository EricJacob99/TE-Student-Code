// add pageTitle

let pageTitle = 'My Shopping List'

// add groceries

const groceries = ["Milk","Bread","Cheese","Potatoes","Tomatoes","Flour","Carrots","Juice","Butter","Deli"]

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  document.getElementById("title").textContent = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  for (let i = 0; i < (groceries.length); i++) {
    var ul = document.getElementById("groceries");
    var li = document.createElement("li");
    li.appendChild(document.createTextNode(groceries[i]));
    ul.appendChild(li);
  }
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const listItems = document.querySelectorAll('#groceries li');
  listItems.forEach(item => {
    item.classList.add('completed');
  });
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
