//B. Perform sorting of an array in descending order.

function sortArrayDescending(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        let maxIndex = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }
        if (maxIndex !== i) {
            // Swap elements if necessary
            let temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    return arr;
}

// Example usage
let inputArray = [4, 2, 7, 1, 9, 3];
let sortedArray = sortArrayDescending(inputArray);
console.log("Sorted Array in Descending Order: " + sortedArray);//Sorted Array in Descending Order: 9,7,4,3,2,1