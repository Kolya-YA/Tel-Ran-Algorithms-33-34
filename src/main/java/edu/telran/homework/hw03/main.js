const bubbleSort = intArr => {
    console.log(intArr)
    let isSwapped
    do {
        isSwapped = false
        for (let i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] > intArr[i + 1]) {
                [intArr[i + 1], intArr[i]] = [intArr[i], intArr[i + 1]]
                isSwapped = true
            }
        }
    } while (isSwapped)

    return intArr
}

const testArr = (length, limit = 100) => [... new Array(length)].map(_ => Math.floor(Math.random() * limit))

console.log(bubbleSort(testArr(4)))
console.log(bubbleSort(testArr(12)))
console.log(bubbleSort(testArr(100, 10000)))
